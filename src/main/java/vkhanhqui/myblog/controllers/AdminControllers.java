package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import vkhanhqui.myblog.models.Category;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.User;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.PostServices;
import vkhanhqui.myblog.services.UserServices;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminControllers {
    @Autowired
    UserServices userServices;

    @Autowired
    PostServices postServices;
    
    @Autowired
    CategoryServices categoryServices;

    @GetMapping("posts/index")
    public String getPostManagementSite(ModelMap modelMap, Principal principal) {
        if (principal != null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
            List<Post> posts = postServices.getAllPosts();
            modelMap.addAttribute("posts", posts);
        }
        return "admin/posts/index";
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
        return "admin/posts/create";
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
        return "admin/posts/create";
    }

    @GetMapping("users/index")
    public String getUserManagementSite(ModelMap modelMap, Principal principal) {
        if (principal != null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
            List<User> users = userServices.getAllUsersExceptCurrentUser(username);
            modelMap.addAttribute("users", users);
        }
        return "admin/users/index";
    }

    @GetMapping("users/create")
    public String getCreatingUserSite(ModelMap modelMap, Principal principal) {
        if (principal != null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
        }
        String message = "";
        modelMap.addAttribute("message", message);
        return "admin/users/create";
    }

    @PostMapping("users/create")
    public String createMember(@RequestParam String username
            , @RequestParam String email
            , @RequestParam String password
            , @RequestParam String passwordConfirmation
            , @RequestParam String role
            , ModelMap modelMap) {
        String message = userServices.checkSignUp(username, email, password, passwordConfirmation, role);
        modelMap.addAttribute("message", message);
        return "admin/users/create";
    }

    @GetMapping("users/alter/{userId}")
    public String getAlternativeUserSite(@PathVariable String userId
            , ModelMap modelMap, Principal principal) {
        if (principal != null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
        }
        modelMap.addAttribute("userId", userId);
        String message = "";
        modelMap.addAttribute("message", message);
        return "admin/users/alter";
    }

    @PostMapping("users/alter/{username}")
    public String alterUser(@PathVariable String username
            , @RequestParam String email
            , @RequestParam String password
            , @RequestParam String passwordConfirmation
            , @RequestParam String role
            , ModelMap modelMap) {
        String message = userServices.checkSignUp(username, email, password, passwordConfirmation, role);
        modelMap.addAttribute("message", message);
        return "admin/users/alter";
    }
}
