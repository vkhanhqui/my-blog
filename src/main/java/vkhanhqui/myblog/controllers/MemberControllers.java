package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import vkhanhqui.myblog.models.dtos.CategoryDTO;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.models.entities.MyUploadForm;
import vkhanhqui.myblog.models.entities.Post;
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
        List<PostDTO> posts = postServices.getAllPostsOfCurrentUser(username);
        modelMap.addAttribute("posts", posts);
        return "member/posts/index";
    }

    @GetMapping("posts/create")
    public String getCreatingPostSite(ModelMap modelMap, Principal principal) {
        String username = principal.getName();
        modelMap.addAttribute("username", username);
        List<CategoryDTO> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        modelMap.addAttribute("post", new Post());
        modelMap.addAttribute("myUploadForm", new MyUploadForm());
        modelMap.addAttribute("thumbnail", null);
        return "member/posts/create";
    }

    @PostMapping("posts/create")
    public String createPost(Principal principal
            , @ModelAttribute("post") Post post
            , @RequestParam long categoryId
            , HttpSession httpSession) {
        String thumbnail = httpSession.getAttribute("thumbnail").toString();
        String username = principal.getName();
        postServices.createPost(username, post, categoryId, thumbnail);
        httpSession.removeAttribute("thumbnail");
        return "redirect:/member/posts/index";
    }

    @GetMapping("posts/edit/{postId}")
    public String getUpdatingPostSite(ModelMap modelMap, Principal principal
            , @PathVariable long postId) {
        String username = principal.getName();
        modelMap.addAttribute("username", username);
        List<CategoryDTO> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        modelMap.addAttribute("post", new Post());
        modelMap.addAttribute("postId", postId);
        modelMap.addAttribute("myUploadForm", new MyUploadForm());
        modelMap.addAttribute("thumbnail", null);
        return "member/posts/edit";
    }

    @PostMapping("posts/edit/{postId}")
    public String updatePost(@ModelAttribute("post") Post post, @PathVariable long postId
            , @RequestParam long categoryId
            , HttpSession httpSession) {
        String thumbnail = httpSession.getAttribute("thumbnail").toString();
        postServices.editPost(postId, post, categoryId, thumbnail);
        httpSession.removeAttribute("thumbnail");
        return "redirect:/member/posts/index";
    }
}
