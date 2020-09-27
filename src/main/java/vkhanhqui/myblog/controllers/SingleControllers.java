package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Category;
import vkhanhqui.myblog.models.Comment;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.dtos.CategoryDTO;
import vkhanhqui.myblog.models.dtos.PostDTO;
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
            , Principal principal, HttpSession httpSession) {
        if (principal != null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
            String role = httpSession.getAttribute("role").toString();
            modelMap.addAttribute("role", role);
        }
        Post post = postServices.getPost(id);
        modelMap.addAttribute("post", post);
        List<Comment> comments = commentServices.getParentComment(post.getId());
        modelMap.addAttribute("comments", comments);
        modelMap.addAttribute("comment", new Comment());
        List<PostDTO> mostViewed = postServices.getTop3ViewedPost();
        modelMap.addAttribute("mostViewed", mostViewed);
        List<CategoryDTO> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        return "single";
    }
}

