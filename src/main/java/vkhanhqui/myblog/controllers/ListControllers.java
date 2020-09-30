package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.services.PostServices;

import java.util.List;

@Controller
@RequestMapping("list")
public class ListControllers {
//    @Autowired
//    private PostServices postServices;

    @GetMapping("/{currentPage}")
    public String getListSite(@PathVariable int currentPage, ModelMap modelMap) {
//        List<PostDTO> posts = postServices.getAllPosts();
//        PagedListHolder pagedListPost = new PagedListHolder(posts);
//        pagedListPost.setPageSize(6);
//        PagedListHolder pagedListNumber = postServices.getPagingSite(currentPage, pagedListPost);
//        modelMap.addAttribute("currentPage", pagedListPost.getPage() + 1);
//        modelMap.addAttribute("pagedListPost", pagedListPost);
//        modelMap.addAttribute("pagedListNumber", pagedListNumber);
        return "notfound";
    }
}
