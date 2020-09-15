package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Category;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.PostServices;

import java.util.List;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("categories")
public class CategoryControllers {
    @Autowired
    CategoryServices categoryServices;
    @Autowired
    private PostServices postServices;

    @GetMapping("/{nameOfCategory}/{currentPage}")
    public String getCategorySite(@PathVariable String nameOfCategory, @PathVariable int currentPage
    		, ModelMap modelMap, HttpSession httpSession) {
    	if(httpSession.getAttribute("username") !=null) {
    		String username = (String) httpSession.getAttribute("username");
    		modelMap.addAttribute("username", username);
    	}
        List<Post> posts = categoryServices.getPosts(nameOfCategory);
        PagedListHolder pagedListPost = new PagedListHolder(posts);
        pagedListPost.setPageSize(6);
        PagedListHolder pagedListNumber = postServices.getPagingSite(currentPage, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
        modelMap.addAttribute("pagedListPost", pagedListPost);
        modelMap.addAttribute("pagedListNumber", pagedListNumber);
        modelMap.addAttribute("nameOfCategory", nameOfCategory);
        List<Category> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        List<Post> mostViewed = postServices.getTheMostViewedPost();
        modelMap.addAttribute("mostViewed", mostViewed);
        return "category-site";
    }
}
