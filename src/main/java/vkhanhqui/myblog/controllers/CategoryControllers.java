package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.dtos.CategoryDTO;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.PostServices;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("categories")
public class CategoryControllers {
    @Autowired
    CategoryServices categoryServices;
    @Autowired
    private PostServices postServices;

    @GetMapping("/{category_id}/{currentPage}")
    public String getCategorySite(@PathVariable Long category_id, @PathVariable int currentPage
            , ModelMap modelMap, Principal principal, HttpSession httpSession) {
        if (principal != null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
            String role = httpSession.getAttribute("role").toString();
            modelMap.addAttribute("role", role);
        }
        List<PostDTO> posts = postServices.getPostsByCategory(category_id);
        PagedListHolder pagedListPost = new PagedListHolder(posts);
        pagedListPost.setPageSize(6);
        PagedListHolder pagedListNumber = postServices.getPagingSite(currentPage, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
        modelMap.addAttribute("pagedListPost", pagedListPost);
        modelMap.addAttribute("pagedListNumber", pagedListNumber);
        modelMap.addAttribute("category_id", category_id);
        List<CategoryDTO> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        List<PostDTO> mostViewed = postServices.getTop3Post();
        modelMap.addAttribute("mostViewed", mostViewed);
        return "category-site";
    }
}
