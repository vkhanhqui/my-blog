package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vkhanhqui.myblog.models.Category;
import vkhanhqui.myblog.models.MyUploadForm;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.PostServices;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("member")
public class MemberControllers {

    @Autowired
    PostServices postServices;

    @Autowired
    CategoryServices categoryServices;
    
    @GetMapping("posts/index")
    public String getPostManagementSite(ModelMap modelMap, Principal principal) {
    	String username = principal.getName();
    	modelMap.addAttribute("username", username);
        List<Post> posts = postServices.getAllPostsOfCurrentUser(username);
        modelMap.addAttribute("posts", posts);
        return "member/posts/index";
    }

    @GetMapping("posts/create")
    public String getCreatingPostSite(ModelMap modelMap, Principal principal, HttpSession httpSession) {
        String username = principal.getName();
        modelMap.addAttribute("username", username);
        List<Category> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        modelMap.addAttribute("post", new Post());
        String message =  "";
        modelMap.addAttribute("message", message);
        modelMap.addAttribute("myUploadForm", new MyUploadForm());
        modelMap.addAttribute("thumbnail",null);
        return "member/posts/create";
    }

    @PostMapping("posts/create")
    public String createPost(ModelMap modelMap, Principal principal
            , @ModelAttribute("post") Post post
            , @RequestParam long categoryId
            , HttpSession httpSession) {
        String thumbnail = httpSession.getAttribute("thumbnail").toString();
        String username = principal.getName();
        String message = postServices.savePost(username, post, categoryId, thumbnail);
        modelMap.addAttribute("message", message);
        httpSession.removeAttribute("thumbnail");
        return "redirect:/member/posts/index";
    }

}
