package vkhanhqui.myblog.controllers;

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

    @Autowired
    private PostServices postServices;

    @GetMapping("/list")
    public String getListOfPosts(Model model) {
        List<Post> posts = postServices.getPosts();
        model.addAttribute("posts", posts);
        return "list-posts";
    }

    @GetMapping("/show")
    public String getFormToAdd(Model model) {
        Post thepost = new Post();
        model.addAttribute("post", thepost);
        return "post-form";
    }

    @PostMapping("/save")
    public String createPost(@ModelAttribute("post") Post post) {
        postServices.saveAPost(post);
        return "redirect:/posts/list";
    }

    @GetMapping("/update")
    public String getFormToUpdate(@RequestParam("postId") long id,
                                    Model model) {
        Post post = postServices.getAPost(id);
        model.addAttribute("post", post);
        return "post-form";
    }

    @GetMapping("/delete")
    public String deletePost(@RequestParam("postId") long id) {
        postServices.deleteAPost(id);
        return "redirect:/posts/list";
    }
}
