package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;
import vkhanhqui.myblog.services.PostServices;

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
//        for (int i = 1; i <= 9; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "/resources/homePage/images/image_1.jpg"
//                    , "detail", null, null, null));
//        }
//        for (int i = 10; i <= 18; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "/resources/homePage/images/image_2.jpg"
//                    , "detail", null, null, null));
//        }
//        for (int i = 19; i <= 27; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "/resources/homePage/images/image_3.jpg"
//                    , "detail", null, null, null));
//        }
//        for (int i = 28; i <= 36; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "/resources/homePage/images/image_4.jpg"
//                    , "detail", null, null, null));
//        }
//        for (int i = 37; i <= 45; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "/resources/homePage/images/image_5.jpg"
//                    , "detail", null, null, null));
//        }
//        for (int i = 46; i <= 48; i++) {
//            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
//                    , new Date(), "12 min read", "/resources/homePage/images/image_6.jpg"
//                    , "detail", null, null, null));
//        }
//        postRepositories.saveAll(list);
////        ----------------------------------------------------------------
        List<Post> posts = postServices.getPosts();
        model.addAttribute("posts", posts);
        return "home";
    }
}