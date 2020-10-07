package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.dtos.CommentDTO;
import vkhanhqui.myblog.models.entities.Comment;

import java.util.List;

@Repository("commentRepository")
public interface CommentRepositories extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPost_IdAndParentIsNull(long postId);
}
