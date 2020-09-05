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
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.CommentServices;
import vkhanhqui.myblog.services.PostServices;

import java.util.List;

@Controller
@RequestMapping("detail")
public class DetailControllers {

    @Autowired
    PostServices postServices;
    @Autowired
    CommentServices commentServices;
    @Autowired
    CategoryServices categoryServices;

    @GetMapping("/{id}")
    public String getDetailSite(@PathVariable long id, ModelMap modelMap) {
        Post post = postServices.getAPost(id);
        List<Category> listCategories = categoryServices.getCategories();
        modelMap.addAttribute("listCategories", listCategories);
        modelMap.addAttribute("post", post);
        List<Comment> comments = commentServices.getParentComment(post.getId());
        modelMap.addAttribute("comments", comments);
        modelMap.addAttribute("comment", new Comment());
        return "detail";
    }
}

