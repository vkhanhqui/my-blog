package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.DataServices;
import vkhanhqui.myblog.services.PostServices;

import java.util.List;


@Controller
@RequestMapping("/")
public class HomeControllers {
    @Autowired
    private PostServices postServices;
    @Autowired
    private DataServices dataServices;

    @GetMapping
    public String pagingHome(ModelMap modelMap) {
//        postServices.deleteAllPost();
        dataServices.createPosts();
    	List<Post> posts = postServices.getPosts();
        PagedListHolder pagedListPost = new PagedListHolder(posts);
    	pagedListPost.setPageSize(3);
        PagedListHolder pagedListNumber = postServices.pagingSite(1, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage()+1);
        modelMap.addAttribute("pagedListPost",pagedListPost);
        modelMap.addAttribute("pagedListNumber",pagedListNumber);
        return "home";
    }

    @GetMapping("/{currentPage}")
    public String pagingHome(@PathVariable int currentPage, ModelMap modelMap) {
    	List<Post> posts = postServices.getPosts();
        PagedListHolder pagedListPost = new PagedListHolder(posts);
    	pagedListPost.setPageSize(3);
        PagedListHolder pagedListNumber = postServices.pagingSite(currentPage, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage()+1);
        modelMap.addAttribute("pagedListPost",pagedListPost);
        modelMap.addAttribute("pagedListNumber",pagedListNumber);
        return "home";
    }
}