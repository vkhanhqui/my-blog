package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Social;

@Repository("socialRepository")
public interface SocialRepositories extends JpaRepository<Social, Integer> {
}
