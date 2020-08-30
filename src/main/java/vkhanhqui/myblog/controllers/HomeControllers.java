package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.services.PostServices;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/")
public class HomeControllers {
    @Autowired
    private PostServices postServices;

    @GetMapping
    public String Paging(HttpServletRequest request, ModelMap modelMap) {
        postServices.createPosts();
        postServices.pagingHomeSite(request, modelMap);
        return "home";
    }
//    @GetMapping
//    public String getHomePage(Model model) {
//        postServices.createPosts();
//        List<Post> posts = postServices.getPosts();
//        model.addAttribute("posts", posts);
//        return "home";
//    }
}