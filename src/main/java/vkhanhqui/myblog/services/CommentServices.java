package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Comment;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.CommentRepositories;

import java.util.Date;
import java.util.List;

@Transactional
@Service
public class CommentServices {
    @Autowired
    PostServices postServices;
    @Autowired
    CommentRepositories commentRepositories;

    public Comment getAComment(long id) {
        return commentRepositories.findById(id).get();
    }

    public void saveAComment(Post post, Comment comment) {
        comment.setReplyTo(null);
        comment.setPost(post);
        comment.setDate(new Date());
        comment.setParent(null);
        commentRepositories.save(comment);
    }

    public void saveAReply(long parentId, Comment comment) {
        comment.setDate(new Date());
        Post postOfParent = commentRepositories.findById(parentId).get().getPost();
        comment.setPost(postOfParent);
        Comment parent = commentRepositories.findById(parentId).get();
        comment.setReplyTo(parent.getCreator());
        Comment parentOfParent = parent.getParent();
        if (parentOfParent != null)
            comment.setParent(parentOfParent);
        else
            comment.setParent(parent);
        commentRepositories.save(comment);
    }

    public List<Comment> getParentComment(long postId) {
        return commentRepositories.findAllByPost_IdAndParentIsNull(postId);
    }
}
