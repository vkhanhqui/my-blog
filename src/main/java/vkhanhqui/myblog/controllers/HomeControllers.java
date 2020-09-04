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

    private void addMinMaxCurrent(ModelMap modelMap, int minPage, int maxPage, int currentPage, PagedListHolder pagedListHolder) {
        modelMap.addAttribute("minPage", minPage);
        modelMap.addAttribute("maxPage", maxPage);
        modelMap.addAttribute("currentPage", currentPage);
        modelMap.addAttribute("pagedListHolder", pagedListHolder);
    }

    private void addListOfPosts(ModelMap modelMap, List<Integer> listElement, List<Post> posts) {
        modelMap.addAttribute("listElement", listElement);
        modelMap.addAttribute("posts", posts);
    }

    @GetMapping
    public String pagingHome(ModelMap modelMap) {
//        postServices.deleteAllPost();
        dataServices.createPosts();
        List<Post> posts = postServices.getPosts();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        pagedListHolder.setPageSize(3);
        int minPage = 0;
        int maxPage = 5;
        addMinMaxCurrent(modelMap, minPage, maxPage, 0, pagedListHolder);
        List<Integer> listElement = postServices.pagingPageNumbersOfHomeSite(0, pagedListHolder, posts);
        addListOfPosts(modelMap, listElement, posts);
        return "home";
    }

    @GetMapping("/{currentPage}")
    public String pagingPageNumbers(@PathVariable int currentPage, ModelMap modelMap) {
        List<Post> posts = postServices.getPosts();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        pagedListHolder.setPageSize(3);
        currentPage -= 1;
        int minPage = 0, maxPage;
        if (currentPage == 0) {
            maxPage = currentPage + 5;
        } else if (currentPage == 1) {
            maxPage = currentPage + 4;
        } else if (currentPage == pagedListHolder.getPageCount() - 2) {
            minPage = currentPage - 3;
            maxPage = currentPage + 2;
        } else if (currentPage == pagedListHolder.getPageCount() - 1) {
            minPage = currentPage - 4;
            maxPage = currentPage + 1;
        } else {
            minPage = currentPage - 2;
            if (currentPage - 2 < 0) {
                minPage = 0;
            }
            maxPage = currentPage + 3;
            if (currentPage + 3 > pagedListHolder.getPageCount() - 1) {
                maxPage = pagedListHolder.getPageCount();
            }
        }
        addMinMaxCurrent(modelMap, minPage, maxPage, currentPage, pagedListHolder);
        List<Integer> listElement = postServices.pagingPageNumbersOfHomeSite(currentPage, pagedListHolder, posts);
        addListOfPosts(modelMap, listElement, posts);
        return "home";
    }
}