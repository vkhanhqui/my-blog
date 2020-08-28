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

    @GetMapping(path = "/list", produces = "text/plain; charset=utf-8")
    @ResponseBody
    public String PagingListSite(@RequestParam int startingPage) {
        String jsp = "";
        List<Post> posts = postServices.getPosts();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        pagedListHolder.setPageSize(9);
        for (int i = 1; i < 10; i++) {
            int currentElement = 9 * startingPage - 10 + i;
            if (startingPage >= pagedListHolder.getPageCount())
                currentElement = 9 * pagedListHolder.getPageCount() - 10 + i;
            else if (startingPage < 1)
                currentElement = 9 - 10 + i;
            if (currentElement < posts.size()) {
//                jsp += currentElement + " ";
//                jsp += posts.get(currentElement).getTitle() + " ";
//                jsp += posts.get(currentElement).getContent() + " ";
//                jsp += posts.get(currentElement).getImages() + " ";
//                jsp += "<br>";
                jsp += " <div class=\"col-md-4 d-flex ftco-animate\">\n" +
                        "                    <div\n" +
                        "                            class=\"blog-entry justify-content-end\">\n" +
                        "                        <a href=\"detail\" class=\"block-20\" style=\"background-image: url(" + posts.get(currentElement).getImages() + ");\">" +
                        "</a>\n" +
                        "                        <div class=\"text p-4 float-right d-block\">\n" +
                        "                            <div class=\"topper d-flex align-items-center\">\n" +
                        "                                <div class=\"one py-2 pl-3 pr-1 align-self-stretch\">\n" +
                        "                                    <span class=\"day\">" + posts.get(currentElement).getDate().getDay() + "</span>\n" +
                        "                                </div>\n" +
                        "                                <div class=\"two pl-0 pr-3 py-2 align-self-stretch\">\n" +
                        "                                    <span class=\"yr\">" + posts.get(currentElement).getDate().getYear() + "</span> <span\n" +
                        "                                        class=\"mos\">" + posts.get(currentElement).getDate().getMonth() + "</span>\n" +
                        "                                </div>\n" +
                        "                            </div>\n" +
                        "                            <h3 class=\"heading mb-3\">\n" +
                        "                                <a href=\"#\">" + posts.get(currentElement).getTitle() + "</a>\n" +
                        "                            </h3>\n" +
                        "                            <p>" + posts.get(currentElement).getContent() + "</p>\n" +
                        "                            <p>\n" +
                        "                                <a href=\"#\" class=\"btn-custom\"><span\n" +
                        "                                        class=\"ion-ios-arrow-round-forward mr-3\"></span>Read more</a>\n" +
                        "                            </p>\n" +
                        "                        </div>\n" +
                        "                    </div>\n" +
                        "                </div>";
            }
        }
        return jsp;
    }
}
