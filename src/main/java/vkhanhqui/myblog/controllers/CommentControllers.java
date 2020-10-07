package vkhanhqui.myblog.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vkhanhqui.myblog.services.CommentServices;

import java.security.Principal;

@Controller
@RequestMapping("comments")
public class CommentControllers {
    @Autowired
    CommentServices commentServices;

    @PostMapping("{post_Id}")
    public String createComment(@PathVariable long post_Id, @RequestParam String comment, Principal principal) {
        commentServices.saveAComment(post_Id, comment, principal.getName());
        return "redirect:/single/" + post_Id;
    }

    @PostMapping("{post_Id}/{parentId}/reply")
    public String createReply(@PathVariable long post_Id,
                              @PathVariable long parentId,
                              @RequestParam String reply,
                              Principal principal) {
        commentServices.saveAReply(post_Id, parentId, reply, principal.getName());
        return "redirect:/single/" + post_Id;
    }
}
