package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import vkhanhqui.myblog.models.Comment;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.CommentServices;
import vkhanhqui.myblog.services.PostServices;

@Controller
@RequestMapping("detail")
public class DetailControllers {

    @Autowired
    PostServices postServices;
    @Autowired
    CommentServices commentServices;

    @GetMapping("/{id}")
    public String getDetailSite(@PathVariable long id, ModelMap modelMap) {
        Post post = postServices.getAPost(id);
        modelMap.addAttribute("post", post);
        modelMap.addAttribute("comment", new Comment());
        return "detail";
    }

    @PostMapping("/save")
    public String savePost(@ModelAttribute("comment") Comment comment) {
        commentServices.saveAComment(comment);
        return "redirect:/detail";
    }
}

