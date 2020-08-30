package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Comment;

@Repository("commentRepository")
public interface CommentRepositories extends JpaRepository<Comment, Long> {
}
