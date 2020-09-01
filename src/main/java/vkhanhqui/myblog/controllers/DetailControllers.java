package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import vkhanhqui.myblog.models.Comment;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.CommentServices;
import vkhanhqui.myblog.services.PostServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @PostMapping("comment/{postId}")
    public String saveComment(@PathVariable long postId,@ModelAttribute("comment") Comment comment) {
        commentServices.saveAComment(postServices.getAPost(postId),comment);
        return "redirect:/detail/"+postId;
    }

//    @PostMapping("reply/{parentId}")
//    public String saveReply(@PathVariable long parentId, @ModelAttribute("comment") Comment comment) {
//        commentServices.saveAComment(postServices.getAPost(parentId),comment);
//        return "redirect:/detail/"+parentId;
//    }
}

