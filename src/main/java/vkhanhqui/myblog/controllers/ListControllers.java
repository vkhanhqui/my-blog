package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.PostServices;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("list")
public class ListControllers {
    @Autowired
    private PostServices postServices;

//    @GetMapping
//    public String getList(Model model) {
//        List<Post> posts = postServices.getPosts();
//        model.addAttribute("posts", posts);
//        return "list";
//    }

    @GetMapping
    public String Paging(HttpServletRequest request, ModelMap modelMap) {
        List<Post> posts = postServices.getPosts();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        int page = ServletRequestUtils.getIntParameter(request, "p", 0);
        pagedListHolder.setPage(page);
        pagedListHolder.setPageSize(9);
        modelMap.put("pagedListHolder", pagedListHolder);
        return "list";
    }
}
