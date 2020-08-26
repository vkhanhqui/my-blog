package vkhanhqui.myblog.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.PostServices;

import java.util.List;


@Controller
@RequestMapping("/posts")
public class PostControllers {
    private static final Logger LOG = LoggerFactory.getLogger(PostControllers.class);

    @Autowired
    private PostServices postService;

    @GetMapping("/list")
    public String listPosts(Model model) {
        List<Post> posts = postService.getPosts();
        model.addAttribute("posts", posts);
        return "list-posts";
    }

    @GetMapping("/show")
    public String showFormForAdd(Model model) {
        LOG.debug("inside show post-form handler method");
        Post thepost = new Post();
        model.addAttribute("post", thepost);
        return "post-form";
    }

    @PostMapping("/save")
    public String savePost(@ModelAttribute("post") Post post) {
        postService.saveAPost(post);
        return "redirect:/posts/list";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("postId") int id,
                                    Model model) {
        Post post = postService.getAPost(id);
        model.addAttribute("post", post);
        return "post-form";
    }

    @GetMapping("/delete")
    public String deletePost(@RequestParam("postId") int id) {
        postService.deleteAPost(id);
        return "redirect:/posts/list";
    }
}
