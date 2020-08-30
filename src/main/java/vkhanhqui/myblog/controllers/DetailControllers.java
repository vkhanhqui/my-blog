package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Comment;
import vkhanhqui.myblog.services.CommentServices;

@Controller
@RequestMapping("detail")
public class DetailControllers {

    @Autowired
    CommentServices commentServices;

    @GetMapping
    public String getDetailSite(Model model) {
        model.addAttribute("comment", new Comment());
        return "detail";
    }

    @PostMapping("/save")
    public String savePost(@ModelAttribute("comment") Comment comment) {
        commentServices.saveAComment(comment);
        return "redirect:/detail";
    }
}

