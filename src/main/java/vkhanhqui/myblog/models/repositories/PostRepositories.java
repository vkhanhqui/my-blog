package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.entities.Post;

import java.util.List;
import java.util.Optional;


@Repository("postRepository")
public interface PostRepositories extends JpaRepository<Post, Long> {
    Optional<List<Post>> findAllByOrderByViewsDesc();

    Optional<List<Post>> findAllByTitleContaining(String keyword);

    Optional<List<Post>> findAllByUserUsername(String username);
    
    @Modifying
    @Query(value = "delete from post where id = ?1", nativeQuery = true)
    void customDeletingPostById(long id);

}
