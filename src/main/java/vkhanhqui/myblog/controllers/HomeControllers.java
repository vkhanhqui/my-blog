package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;
import vkhanhqui.myblog.services.PostServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/")
public class HomeControllers {
    @Autowired
    private PostRepositories postRepositories;
    @Autowired
    private PostServices postServices;

    @GetMapping
    public String getHomePage(Model model) {
////        ----------------------------------------------------------------
//        List<Post> list = new ArrayList<>();
//        for (int i = 1; i <= 46; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "/resources/homePage/images/image_1.jpg"
//                    , "detail", null, null, null));
//        }
//        postRepositories.saveAll(list);
////        ----------------------------------------------------------------
        List<Post> posts = postServices.getPosts();
        model.addAttribute("posts", posts);
        return "home";
    }
}