package vkhanhqui.myblog.models.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.dtos.PostDTO;

import java.util.List;
import java.util.Optional;


@Repository("postRepository")
public interface PostRepositories extends JpaRepository<Post, Long> {

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(id, title, description" +
            ", content, date, reading_time, thumbnail, views) " +
            "from Post")
    List<PostDTO> findAllPosts();

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(id, title, description" +
            ", content, date, reading_time, thumbnail, views) " +
            "from Post ORDER BY views DESC")
    List<PostDTO> findTop3ByOrderByViewsDesc(Pageable pageable);

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(id, title, description" +
            ", content, date, reading_time, thumbnail, views) " +
            "from Post ORDER BY views DESC")
    List<PostDTO> findTop5ByOrderByViewsDesc(Pageable pageable);

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(p.id, p.title, p.description" +
            ", p.content, p.date, p.reading_time, p.thumbnail, p.views) " +
            "from Post p where p.category.name like ?1")
    List<PostDTO> findAllByCategoryName(String nameOfCategory);

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(p.id, p.title, p.description" +
            ", p.content, p.date, p.reading_time, p.thumbnail, p.views) " +
            "from Post p where p.id = ?1")
    PostDTO findByIdToDTO(long id);

    Optional<List<Post>> findAllByTitleContaining(String keyword);

    Optional<List<Post>> findAllByUserUsername(String username);

    @Modifying
    @Query(value = "delete from post where id = ?1", nativeQuery = true)
    void customDeletingPostById(long id);

}
