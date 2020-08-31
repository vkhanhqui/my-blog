package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.services.DataServices;
import vkhanhqui.myblog.services.PostServices;


@Controller
@RequestMapping("/")
public class HomeControllers {
    @Autowired
    private PostServices postServices;
    @Autowired
    private DataServices dataServices;

    @GetMapping
    public String pagingHome(ModelMap modelMap) {
//        dataServices.createPosts();
        postServices.pagingHomeSite(1, modelMap);
        return "home";
    }

    @GetMapping("/{currentPage}")
    public String pagingPageNumbers(@PathVariable int currentPage, ModelMap modelMap) {
        postServices.pagingHomeSite(currentPage,modelMap);
        return "home";
    }
}