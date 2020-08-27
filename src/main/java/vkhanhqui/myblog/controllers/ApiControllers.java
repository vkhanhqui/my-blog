package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.PostServices;

import java.util.List;

@Controller
@RequestMapping("api")
@SessionAttributes({"post"})
public class ApiControllers {
    @Autowired
    PostServices postServices;

    @GetMapping("/list")
    @ResponseBody
    public String PagingListSite(@RequestParam int startingPage) {
        String jsp = "";
        List<Post> posts = (List<Post>) postServices.getAllPosts();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        pagedListHolder.setPageSize(9);
        for (int i = 1; i < 10; i++) {
            int currentElement = 9 * startingPage - 10 + i;
            if (startingPage >= pagedListHolder.getPageCount())
                currentElement = 9 * pagedListHolder.getPageCount() - 10 + i;
            else if (startingPage < 1)
                currentElement = 9 - 10 + i;
            if (currentElement < posts.size()) {
                jsp += currentElement + " ";
                jsp += posts.get(currentElement).getTitle() + " ";
                jsp += posts.get(currentElement).getContent() + " ";
                jsp += posts.get(currentElement).getImages() + " ";
                jsp += "<br>";
            }
        }
        return jsp;
    }
}
