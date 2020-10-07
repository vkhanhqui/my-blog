package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.dtos.CategoryDTO;
import vkhanhqui.myblog.models.dtos.CommentDTO;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.models.entities.Category;
import vkhanhqui.myblog.models.entities.Comment;
import vkhanhqui.myblog.models.entities.Post;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.CommentServices;
import vkhanhqui.myblog.services.PostServices;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("single")
public class SingleControllers {

    @Autowired
    PostServices postServices;
    @Autowired
    CommentServices commentServices;
    @Autowired
    CategoryServices categoryServices;

    @GetMapping("/{id}")
    public String getDetailSite(@PathVariable long id, ModelMap modelMap
            , Principal principal) {
        if (principal != null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
        }
        PostDTO post = postServices.getPost(id);
        modelMap.addAttribute("post", post);
        List<CommentDTO> comments = commentServices.getComments(id);
        modelMap.addAttribute("comments", comments);
        List<PostDTO> mostViewed = postServices.getTop3Post();
        modelMap.addAttribute("mostViewed", mostViewed);
        List<CategoryDTO> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        return "single";
    }
}

