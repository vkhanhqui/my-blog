package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import vkhanhqui.myblog.models.MyUploadForm;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.User;
import vkhanhqui.myblog.models.dtos.CategoryDTO;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.PostServices;
import vkhanhqui.myblog.services.UserServices;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("admin")
@SessionAttributes({"postId"})
public class AdminControllers {
    @Autowired
    UserServices userServices;

    @Autowired
    PostServices postServices;

    @Autowired
    CategoryServices categoryServices;

    @GetMapping("posts/index")
    public String getPostManagementSite(ModelMap modelMap, HttpSession httpSession) {
        String username = httpSession.getAttribute("username").toString();
        modelMap.addAttribute("username", username);
        List<PostDTO> posts = postServices.getAllPosts();
        modelMap.addAttribute("posts", posts);

        return "admin/posts/index";
    }

    @GetMapping("posts/create")
    public String getCreatingPostSite(ModelMap modelMap, HttpSession httpSession) {
        String username = httpSession.getAttribute("username").toString();
        modelMap.addAttribute("username", username);

        List<CategoryDTO> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        modelMap.addAttribute("post", new Post());
        String message = "";
        modelMap.addAttribute("message", message);
        modelMap.addAttribute("myUploadForm", new MyUploadForm());
        modelMap.addAttribute("thumbnail", null);
        return "admin/posts/create";
    }

    @PostMapping("posts/create")
    public String createPost(ModelMap modelMap
            , @ModelAttribute("post") Post post
            , @RequestParam long categoryId
            , HttpSession httpSession) {
        String thumbnail = httpSession.getAttribute("thumbnail").toString();
        String username = httpSession.getAttribute("username").toString();
        String message = postServices.savePost(username, post, categoryId, thumbnail);
        modelMap.addAttribute("message", message);
        httpSession.removeAttribute("thumbnail");
        return "redirect:/admin/posts/index";
    }

    @GetMapping("posts/edit/{postId}")
    public String getUpdatingPostSite(ModelMap modelMap, HttpSession httpSession
            , @PathVariable long postId) {
        String username = httpSession.getAttribute("username").toString();
        modelMap.addAttribute("username", username);
        List<CategoryDTO> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        String message = "";
        modelMap.addAttribute("message", message);
        modelMap.addAttribute("post", new Post());
        modelMap.addAttribute("postId", postId);
        modelMap.addAttribute("myUploadForm", new MyUploadForm());
        modelMap.addAttribute("thumbnail", null);
        return "admin/posts/edit";
    }

    @PostMapping("posts/edit")
    public String updatePost(ModelMap modelMap, @ModelAttribute("post") Post post
            , @RequestParam long categoryId
            , HttpSession httpSession) {
        String thumbnail = httpSession.getAttribute("thumbnail").toString();
        long postId = (long) httpSession.getAttribute("postId");
        String message = postServices.editPost(postId, post, categoryId, thumbnail);
        modelMap.addAttribute("message", message);
        httpSession.removeAttribute("thumbnail");
        httpSession.removeAttribute("postId");
        return "redirect:/admin/posts/index";
    }

    @GetMapping("users/index")
    public String getUserManagementSite(ModelMap modelMap, HttpSession httpSession) {
        String username = httpSession.getAttribute("username").toString();
        modelMap.addAttribute("username", username);
        List<User> users = userServices.getAllUsersExceptCurrentUser(username);
        modelMap.addAttribute("users", users);
        return "admin/users/index";
    }

    @GetMapping("users/create")
    public String getCreatingUserSite(ModelMap modelMap, HttpSession httpSession) {
        String username = httpSession.getAttribute("username").toString();
        modelMap.addAttribute("username", username);
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
            , ModelMap modelMap, HttpSession httpSession) {
        String username = httpSession.getAttribute("username").toString();
        modelMap.addAttribute("username", username);
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
