package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import vkhanhqui.myblog.models.dtos.CategoryDTO;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.models.entities.Category;
import vkhanhqui.myblog.models.entities.Post;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.PostServices;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("keywords")
public class SearchControllers {
    @Autowired
    PostServices postServices;
    @Autowired
    CategoryServices categoryServices;

    @PostMapping
    public String getKeyword(@RequestParam String keywords) {
        return "redirect:/keywords/" + keywords + "/1";
    }

    @GetMapping("/{keywords}/{currentPage}")
    public String getKeywordSite(@PathVariable String keywords, @PathVariable int currentPage
            , ModelMap modelMap, Principal principal, HttpSession httpSession) {
        if (principal != null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
            String role = httpSession.getAttribute("role").toString();
            modelMap.addAttribute("role", role);
        }
        List<PostDTO> posts = postServices.getPostsByRelatedWords(keywords);
        PagedListHolder pagedListPost = new PagedListHolder(posts);
        pagedListPost.setPageSize(6);
        PagedListHolder pagedListNumber = postServices.getPagingSite(currentPage, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
        modelMap.addAttribute("pagedListPost", pagedListPost);
        modelMap.addAttribute("pagedListNumber", pagedListNumber);
        modelMap.addAttribute("keywords", keywords);
        List<CategoryDTO> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        List<PostDTO> mostViewed = postServices.getTop3Post();
        modelMap.addAttribute("mostViewed", mostViewed);
        return "search-site";
    }
}
