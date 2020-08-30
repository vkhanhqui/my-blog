package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Comment;
import vkhanhqui.myblog.models.repositories.CommentRepositories;

@Transactional
@Service
public class CommentServices {
    @Autowired
    CommentRepositories commentRepositories;

    public void saveAComment(Comment comment){
        commentRepositories.save(comment);
    }
}
