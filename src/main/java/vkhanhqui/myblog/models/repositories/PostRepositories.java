package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Post;


@Repository("postRepository")
public interface PostRepositories extends JpaRepository<Post, Integer>{

}
