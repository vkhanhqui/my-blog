package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Comment;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.CommentRepositories;

import java.util.Date;

@Transactional
@Service
public class CommentServices {
    @Autowired
    PostServices postServices;
    @Autowired
    CommentRepositories commentRepositories;

    public Comment getAComment(long id){
        return commentRepositories.findById(id).get();
    }
    public void saveAComment(Post post, long parentId, Comment comment) {
        comment.setPost(post);
        comment.setDate(new Date());
        comment.setParentId(parentId);
        commentRepositories.save(comment);
    }
    public void saveAReply(long parentId, Comment comment) {
        comment.setPost(commentRepositories.findById(parentId).get().getPost());
        comment.setDate(new Date());
        comment.setParentId(parentId);
        commentRepositories.save(comment);
    }
}
