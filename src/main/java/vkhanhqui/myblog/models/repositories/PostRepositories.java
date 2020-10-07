package vkhanhqui.myblog.models.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.models.entities.Post;

import java.util.List;
import java.util.Optional;


@Repository("postRepository")
public interface PostRepositories extends JpaRepository<Post, Long> {

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(id, title" +
            "                    , description, date" +
            "                    , thumbnail, user.username)" +
            " from Post")
    List<PostDTO> findAllPostsForHomeSite();

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(id, title, user.username, views)" +
            " from Post ORDER BY views DESC")
    List<PostDTO> findAllPostsForAdminSite();

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(id, title, thumbnail) " +
            "from Post ORDER BY views DESC")
    List<PostDTO> findTop3ByOrderByViewsDesc(Pageable pageable);

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(id, title, thumbnail, date, user.username) " +
            "from Post ORDER BY views DESC")
    List<PostDTO> findTop5ByOrderByViewsDesc(Pageable pageable);

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(id, title, description" +
            ", date, thumbnail, user.username) " +
            "from Post p where p.title like %?1%")
    List<PostDTO> findAllByTitleContaining(String keyword);

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(id, title) " +
            "from Post where user.username like ?1")
    List<PostDTO> findAllByUserUsername(String username);

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(title, id, content) " +
            "from Post where id = ?1")
    PostDTO findPostById(Long id);

    @Query(value = "select new vkhanhqui.myblog.models.dtos.PostDTO(id, title, description" +
            ", date, thumbnail, user.username) " +
            "from Post where category.id = ?1")
    List<PostDTO> findAllByCategoryName(Long category_id);
    
    @Modifying
    @Query(value = "delete from post where id = ?1", nativeQuery = true)
    void customDeletingPostById(long id);

}
