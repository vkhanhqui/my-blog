package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vkhanhqui.myblog.models.Category;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.CategoryServices;
import vkhanhqui.myblog.services.PostServices;
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
	public String getKeywordSite(@PathVariable String keywords, @PathVariable int currentPage, ModelMap modelMap) {
		List<Post> posts = postServices.getPostsByRelatedWords(keywords);
		PagedListHolder pagedListPost = new PagedListHolder(posts);
		pagedListPost.setPageSize(6);
		PagedListHolder pagedListNumber = postServices.getPagingSite(currentPage, pagedListPost);
		modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
		modelMap.addAttribute("pagedListPost", pagedListPost);
		modelMap.addAttribute("pagedListNumber", pagedListNumber);
		modelMap.addAttribute("keywords", keywords);
		List<Category> listOfCategories = categoryServices.getCategories();
		modelMap.addAttribute("listOfCategories", listOfCategories);
		List<Post> mostViewed = postServices.getTheMostViewedPost();
		modelMap.addAttribute("mostViewed", mostViewed);
		return "search-site";
	}
}
