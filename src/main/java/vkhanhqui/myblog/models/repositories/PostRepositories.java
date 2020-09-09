package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Post;

import java.util.List;
import java.util.Optional;


@Repository("postRepository")
public interface PostRepositories extends JpaRepository<Post, Long> {
    Optional<List<Post>> findAllByOrderByViewsDesc();
    Optional<List<Post>> findAllByTitleContaining(String keyword);
}
