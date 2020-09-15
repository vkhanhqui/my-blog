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
import vkhanhqui.myblog.services.DataServices;
import vkhanhqui.myblog.services.PostServices;

import java.util.List;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/")
public class HomeControllers {
	
    @Autowired
    private PostServices postServices;
    
    @Autowired
    private DataServices dataServices;
    
    @Autowired
    CategoryServices categoryServices;

    @GetMapping
    public String getHomeSite(ModelMap modelMap, HttpSession httpSession) {
//        postServices.deleteAllPost();
//        dataServices.createPosts();
    	if(httpSession.getAttribute("username") !=null) {
    		String username = (String) httpSession.getAttribute("username");
    		modelMap.addAttribute("username", username);
    	}
        List<Post> posts = postServices.getPosts();
        PagedListHolder pagedListPost = new PagedListHolder(posts);
        pagedListPost.setPageSize(3);
        PagedListHolder pagedListNumber = postServices.getPagingSite(1, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
        modelMap.addAttribute("pagedListPost", pagedListPost);
        modelMap.addAttribute("pagedListNumber", pagedListNumber);
        List<Category> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        List<Post> mostViewed = postServices.getTheMostViewedPost();
        modelMap.addAttribute("mostViewed", mostViewed);
        List<Post> topFiveViewedPost = postServices.getTopFiveViewedPost();
        modelMap.addAttribute("topFiveViewedPost", topFiveViewedPost);
        return "index";
    }

    @GetMapping("/{currentPage}")
    public String getPagingHomeSite(@PathVariable int currentPage, ModelMap modelMap
    		, HttpSession httpSession) {
    	if(httpSession.getAttribute("username") !=null) {
    		String username = (String) httpSession.getAttribute("username");
    		modelMap.addAttribute("username", username);
    	}
        List<Post> posts = postServices.getPosts();
        PagedListHolder pagedListPost = new PagedListHolder(posts);
        pagedListPost.setPageSize(3);
        PagedListHolder pagedListNumber = postServices.getPagingSite(currentPage, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
        modelMap.addAttribute("pagedListPost", pagedListPost);
        modelMap.addAttribute("pagedListNumber", pagedListNumber);
        List<Category> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        List<Post> mostViewed = postServices.getTheMostViewedPost();
        modelMap.addAttribute("mostViewed", mostViewed);
        List<Post> topFiveViewedPost = postServices.getTopFiveViewedPost();
        modelMap.addAttribute("topFiveViewedPost", topFiveViewedPost);
        return "index";
    }
}