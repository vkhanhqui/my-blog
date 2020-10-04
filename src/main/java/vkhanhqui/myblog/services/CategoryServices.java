package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.entities.Category;
import vkhanhqui.myblog.models.entities.Post;
import vkhanhqui.myblog.models.repositories.CategoryRepositories;

import java.util.List;

@Transactional
@Service
public class CategoryServices {
    @Autowired
    CategoryRepositories categoryRepositories;

    public List<Post> getPosts(String nameOfCategory) {
        Category category = categoryRepositories.findByName(nameOfCategory);
        return category.getPosts();
    }

    public List<Category> getCategories() {
        return categoryRepositories.findAll();
    }
}
