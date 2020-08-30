package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Reply;

@Repository("replyRepositories")
public interface ReplyRepositories extends JpaRepository<Reply, Long> {
}
