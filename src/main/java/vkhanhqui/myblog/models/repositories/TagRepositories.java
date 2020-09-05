package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Tag;

@Repository("tagRepository")
public interface TagRepositories extends JpaRepository<Tag, Long> {
    Tag findByName(String nameTag);
}
