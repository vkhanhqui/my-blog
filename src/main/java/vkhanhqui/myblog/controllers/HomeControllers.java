package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import vkhanhqui.myblog.models.dtos.CategoryDTO;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.DataServices;
import vkhanhqui.myblog.services.PostServices;
import vkhanhqui.myblog.services.UserServices;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;


@Controller
@RequestMapping("/")
@SessionAttributes({"role", "username"})
public class HomeControllers {

    @Autowired
    CategoryServices categoryServices;
    @Autowired
    UserServices userServices;
    @Autowired
    private PostServices postServices;
//    @Autowired
//    private DataServices dataServices;

    @GetMapping
    public String getHomeSite(ModelMap modelMap, Principal principal) {
//        postServices.deleteAllPosts();
//        dataServices.createPosts();
        if (principal != null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
            String role = userServices.findSupremeRole(username);
            modelMap.addAttribute("role", role);
        }
        List<PostDTO> posts = postServices.getAllPostsForHome();
        PagedListHolder pagedListPost = new PagedListHolder(posts);
        pagedListPost.setPageSize(3);
        PagedListHolder pagedListNumber = postServices.getPagingSite(1, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
        modelMap.addAttribute("pagedListPost", pagedListPost);
        modelMap.addAttribute("pagedListNumber", pagedListNumber);
        List<CategoryDTO> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        List<PostDTO> mostViewed = postServices.getTop3Post();
        modelMap.addAttribute("mostViewed", mostViewed);
        List<PostDTO> topFiveViewedPost = postServices.getTop5Post();
        modelMap.addAttribute("topFiveViewedPost", topFiveViewedPost);
        return "index";
    }

    @GetMapping("/{currentPage}")
    public String getPagingHomeSite(@PathVariable int currentPage, ModelMap modelMap
            , Principal principal, HttpSession httpSession) {
        if (principal != null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
            String role = httpSession.getAttribute("role").toString();
            modelMap.addAttribute("role", role);
        }
        List<PostDTO> posts = postServices.getAllPostsForHome();
        PagedListHolder pagedListPost = new PagedListHolder(posts);
        pagedListPost.setPageSize(3);
        PagedListHolder pagedListNumber = postServices.getPagingSite(currentPage, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
        modelMap.addAttribute("pagedListPost", pagedListPost);
        modelMap.addAttribute("pagedListNumber", pagedListNumber);
        List<CategoryDTO> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        List<PostDTO> mostViewed = postServices.getTop3Post();
        modelMap.addAttribute("mostViewed", mostViewed);
        List<PostDTO> topFiveViewedPost = postServices.getTop5Post();
        modelMap.addAttribute("topFiveViewedPost", topFiveViewedPost);
        return "index";
    }
}