package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.dtos.CategoryDTO;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.models.entities.Category;
import vkhanhqui.myblog.models.entities.Post;
import vkhanhqui.myblog.models.repositories.CategoryRepositories;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class CategoryServices {
    @Autowired
    CategoryRepositories categoryRepositories;

    public List<PostDTO> getPosts(String nameOfCategory) {
        Category category = categoryRepositories.findByName(nameOfCategory);
        List<Post> posts = category.getPosts();
        List<PostDTO> postDTOS = new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            postDTOS.add(i, new PostDTO(post.getId(),post.getTitle()
                    ,post.getDescription(), post.getContent(), post.getDate()
                    , post.getReading(), post.getThumbnail(),post.getViews(), post.getUser().getUsername()
            ));
        }
        return postDTOS;
    }

    public List<CategoryDTO> getCategories() {
        List<Category> categories = categoryRepositories.findAll();
        List<CategoryDTO> categoryDTOS = new ArrayList<>();
        for(int i=0; i< categories.size(); i++){
            Category category = categories.get(i);
            categoryDTOS.add(i, new CategoryDTO(category.getId(),category.getName()));
        }
        return categoryDTOS;
    }
}
