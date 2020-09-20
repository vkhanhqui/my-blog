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
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.PostServices;

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
    public String getCreatingPostSite(ModelMap modelMap, Principal principal) {
        String username = principal.getName();
        modelMap.addAttribute("username", username);
        List<Category> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        modelMap.addAttribute("post", new Post());
        String message = "";
        modelMap.addAttribute("message", message);
        return "member/posts/create";
    }
    
    @PostMapping("posts/create")
    public String createPost(ModelMap modelMap, Principal principal, @ModelAttribute("post") Post post
    		, @RequestParam long categoryId) {
        String username = principal.getName();
        String message = "<div class=\"msg success\">\r\n" + "               <li>Successfully</li>\r\n"
                + "           </div>";
        try {
            postServices.savePost(username, post, categoryId);
        }
        catch (Exception e) {
        	message = "<div class=\"msg error\">\r\n" + "               <li>Username is required</li>\r\n"
                    + "           </div>";
		}
        modelMap.addAttribute("message", message);
        return "member/posts/create";
    }

}
