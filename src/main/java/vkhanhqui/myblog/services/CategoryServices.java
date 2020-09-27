package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Category;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.dtos.CategoryDTO;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.models.repositories.CategoryRepositories;

import java.util.List;

@Transactional
@Service
public class CategoryServices {
    @Autowired
    CategoryRepositories categoryRepositories;

    public List<PostDTO> getPosts(String nameOfCategory) {
        Category category = categoryRepositories.findByName(nameOfCategory);
        return category.getPosts();
    }

    public List<CategoryDTO> getCategories() {
        return categoryRepositories.findAllCategories();
    }
}
