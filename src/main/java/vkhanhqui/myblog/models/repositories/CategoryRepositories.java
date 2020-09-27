package vkhanhqui.myblog.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vkhanhqui.myblog.models.Category;
import vkhanhqui.myblog.models.dtos.CategoryDTO;
import vkhanhqui.myblog.models.dtos.PostDTO;

import java.util.List;

@Repository("categoryRepository")
public interface CategoryRepositories extends JpaRepository<Category, Long> {

    @Query(value = "select new vkhanhqui.myblog.models.dtos.CategoryDTO(id, name) " +
            "from Category")
    List<CategoryDTO> findAllCategories();
}
