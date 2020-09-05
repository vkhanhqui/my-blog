package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.PostServices;
import vkhanhqui.myblog.services.TagServices;

import java.util.List;

@Controller
@RequestMapping("tags")
public class TagControllers {
    @Autowired
    TagServices tagServices;
    @Autowired
    private PostServices postServices;

    @GetMapping("/{nameTag}/{currentPage}")
    public String pagingPageNumbers(@PathVariable String nameTag, @PathVariable int currentPage, ModelMap modelMap) {
        List<Post> posts = tagServices.getPosts(nameTag);
        PagedListHolder pagedListPost = new PagedListHolder(posts);
        pagedListPost.setPageSize(6);
        PagedListHolder pagedListNumber = postServices.pagingSite(currentPage, pagedListPost);
        modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
        modelMap.addAttribute("pagedListPost", pagedListPost);
        modelMap.addAttribute("pagedListNumber", pagedListNumber);
        modelMap.addAttribute("nameTag", nameTag);
        return "tag";
    }
}
