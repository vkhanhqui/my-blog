package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.dtos.CommentDTO;
import vkhanhqui.myblog.models.entities.Comment;
import vkhanhqui.myblog.models.repositories.CommentRepositories;
import vkhanhqui.myblog.models.repositories.PostRepositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Transactional
@Service
public class CommentServices {
    @Autowired
    PostRepositories postRepositories;
    @Autowired
    CommentRepositories commentRepositories;

    public void saveAComment(long post_id, String comment, String currentUser) {
        Comment temp = new Comment(
                new Random().nextLong()
                , currentUser
                , null
                , comment
                , new Date()
                , null
                , null
                , postRepositories.findById(post_id).get()
        );
        commentRepositories.save(temp);
    }

    public void saveAReply(long post_id, long parentId, String reply, String currentUser) {
        Comment parent = commentRepositories.findById(parentId).get();
        Comment temp = new Comment(
                new Random().nextLong()
                , currentUser
                , parent.getCreator()
                , reply
                , new Date()
                , parent
                , null
                , postRepositories.findById(post_id).get()
        );
        commentRepositories.save(temp);
    }

    public List<CommentDTO> getComments(long postId) {
        List<Comment> comments = commentRepositories.findAllByPost_IdAndParentIsNull(postId);
        List<CommentDTO> commentDTOS = new ArrayList<>();
        for (int i=0; i <comments.size();i++){
            Comment comment = comments.get(i);
            commentDTOS.add(i,new CommentDTO(
                    comment.getId()
                    ,comment.getCreator()
                    ,comment.getReplyTo()
                    ,comment.getContent()
                    ,comment.getDate()
                    ,comment.getParent()
                    ,comment.getChildren()
                    )
            );
        }
        return commentDTOS;
    }
}
