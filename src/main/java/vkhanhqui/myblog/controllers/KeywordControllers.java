package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vkhanhqui.myblog.models.Category;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.PostServices;

import java.util.List;

@Controller
@RequestMapping("keywords")
public class KeywordControllers {
    @Autowired
    PostServices postServices;
    @Autowired
    CategoryServices categoryServices;
    
    @GetMapping
    public String getKeyword(@ModelAttribute("keyword") Post post){
        String keyword = post.getTitle();
        return "redirect:/keywords/"+keyword+"/1";
    }

    @GetMapping("/{keyword}/{currentPage}")
    public String getKeywordSite(@PathVariable String keyword, @PathVariable int currentPage, ModelMap modelMap) {
    	List<Category> listOfCategories = categoryServices.getCategories();
        modelMap.addAttribute("listOfCategories", listOfCategories);
        List<Post> mostViewed = postServices.getTheMostViewedPost();
        modelMap.addAttribute("mostViewed", mostViewed);
    	
    	List<Post> posts = postServices.getPostsByRelatedWords(keyword);
        PagedListHolder pagedListPost = new PagedListHolder(posts);
        pagedListPost.setPageSize(6);
        PagedListHolder pagedListNumber = postServices.getPagingSite(currentPage, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
        modelMap.addAttribute("pagedListPost", pagedListPost);
        modelMap.addAttribute("pagedListNumber", pagedListNumber);
        modelMap.addAttribute("keyword", keyword);
        modelMap.addAttribute("newKeyword", new Post());
        return "search-site";
    }
}
