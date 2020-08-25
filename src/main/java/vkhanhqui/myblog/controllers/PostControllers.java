package vkhanhqui.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vkhanhqui.myblog.controllers.exceptions.ResourceNotFoundException;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.PostServices;


@Controller
@RequestMapping("/posts")
public class PostControllers {
	private static final Logger LOG = LoggerFactory.getLogger(PostControllers.class);

    @Autowired
    private PostServices postService;

    @GetMapping("/list")
    public String listposts(Model theModel) {
        List<Post> theposts = postService.getposts();
        theModel.addAttribute("posts", theposts);
        return "list-posts";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        LOG.debug("inside show post-form handler method");
        Post thepost = new Post();
        theModel.addAttribute("post", thepost);
        return "post-form";
    }

    @PostMapping("/savepost")
    public String savepost(@ModelAttribute("post") Post thepost) {
        postService.savepost(thepost);
        return "redirect:/post/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("postId") int theId,
        Model theModel) throws ResourceNotFoundException {
        Post thepost = postService.getpost(theId);
        theModel.addAttribute("post", thepost);
        return "post-form";
    }

    @GetMapping("/delete")
    public String deletepost(@RequestParam("postId") int theId) throws ResourceNotFoundException {
        postService.deletepost(theId);
        return "redirect:/post/list";
    }   
}
