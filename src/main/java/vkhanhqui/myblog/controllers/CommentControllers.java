package vkhanhqui.myblog.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import vkhanhqui.myblog.models.Comment;
import vkhanhqui.myblog.services.CommentServices;

@Controller
@RequestMapping("detail/comments")
public class CommentControllers {
    @Autowired
    CommentServices commentServices;

    @GetMapping("/reply/{parentId}")
    public String getDetailSite(@PathVariable long parentId, ModelMap modelMap) {
        Comment parent = commentServices.getAComment(parentId);
        modelMap.addAttribute("parent", parent);
        modelMap.addAttribute("reply", new Comment());
        return "reply";
    }

    @PostMapping("/{postId}")
    public String saveComment(@PathVariable long postId, @ModelAttribute("comment") Comment comment) {
        commentServices.saveAComment(postId, comment);
        return "redirect:/detail/" + postId;
    }

    @PostMapping("/reply/{parentId}")
    public String saveReply(@PathVariable long parentId, @ModelAttribute("comment") Comment comment) {
        commentServices.saveAReply(parentId, comment);
        return "redirect:/detail/" + comment.getPost().getId();
    }
}
