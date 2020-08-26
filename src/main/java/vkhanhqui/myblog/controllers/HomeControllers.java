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
    private PostServices postService;

    @GetMapping
    public String getHomePage(Model model) {
//        Social sc1 = new Social();sc1.setId(1);sc1.setName("icon-github");
//        Social sc2 = new Social();sc2.setId(2);sc2.setName("icon-facebook");
//        Social sc3 = new Social();sc3.setId(3);sc3.setName("icon-instagram");
//        Set<Social> listsc = new HashSet<>();
//        listsc.add(sc1);listsc.add(sc2);listsc.add(sc3);
//        socialRepositories.saveAll(listsc);
////        ----------------------------------------------------------------
        List<Post> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new Post(i, "title", "description", "contentttttttt"
                    , new Date(), "12 min read", "/resources/homePage/images/image_1.jpg"
                    , "detail",null,null,null));
        }
        postRepositories.saveAll(list);
        List<Post> posts = postService.getPosts();
        model.addAttribute("posts", posts);
        return "home";
    }
}