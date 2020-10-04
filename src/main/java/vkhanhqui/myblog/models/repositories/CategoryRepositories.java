package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.entities.Category;

@Repository("categoryRepository")
public interface CategoryRepositories extends JpaRepository<Category, Long> {
    Category findByName(String nameCategory);
}
