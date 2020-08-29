package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;

import java.util.List;

@Service
public class ApiServices {
    @Autowired
    private PostRepositories postRepositories;

    public String ajaxHomeSite(int startingPage) {
        List<Post> posts = postRepositories.findAll();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        pagedListHolder.setPageSize(5);
        String jsp = "";
        for (int i = 1; i < 6; i++) {
            int currentElement = 5 * startingPage - 6 + i;
            if (startingPage >= pagedListHolder.getPageCount())
                currentElement = 5 * pagedListHolder.getPageCount() - 6 + i;
            else if (startingPage < 1)
                currentElement = 5 - 6 + i;
            if (currentElement < posts.size()) {
//                jsp += currentElement + " ";
//                jsp += posts.get(currentElement).getTitle() + " ";
//                jsp += posts.get(currentElement).getContent() + " ";
//                jsp += posts.get(currentElement).getImages() + " ";
//                jsp += "<br>";
                jsp += " <div class=\"case\">\n" +
                        "                        <div class=\"row\">\n" +
                        "                            <div class=\"col-md-6 col-lg-6 col-xl-8 d-flex\">\n" +
                        "                                <a href=\"detail\" class=\"img w-100 mb-3 mb-md-0\"\n" +
                        "                                   style=\"background-image: url(" + posts.get(currentElement).getImages() + ");\"></a>\n" +
                        "                            </div>\n" +
                        "                            <div class=\"col-md-6 col-lg-6 col-xl-4 d-flex\">\n" +
                        "                                <div class=\"text w-100 pl-md-3\">\n" +
                        "                                    <span class=\"subheading\">Illustration</span>\n" +
                        "                                    <h2>\n" +
                        "                                        <a href=\"" + posts.get(currentElement).getLink() + "\">" + posts.get(currentElement).getTitle() + "</a>\n" +
                        "                                    </h2>\n" +
                        "                                        <ul class=\"media-social list-unstyled\">\n" +
                        "                                            <li class=\"ftco-animate\"><a href=\"#\"><span\n" +
                        "                                                    class=\"icon-twitter\"></span></a></li>\n" +
                        "                                            <li class=\"ftco-animate\"><a href=\"#\"><span\n" +
                        "                                                    class=\"icon-facebook\"></span></a></li>\n" +
                        "                                            <li class=\"ftco-animate\"><a href=\"#\"><span\n" +
                        "                                                    class=\"icon-instagram\"></span></a></li>\n" +
                        "                                        </ul>\n" +
                        "                                    <div class=\"meta\">\n" +
                        "                                        <p class=\"mb-0\">\n" +
                        "                                            <a href=\"#\">" + posts.get(currentElement).getDate().getMonth() + "/" + posts.get(currentElement).getDate().getDay() + "/" + posts.get(currentElement).getDate().getYear() + "</a>\n" +
                        "                                            | <a\n" +
                        "                                                href=\"#\">" + posts.get(currentElement).getReading() + "</a>\n" +
                        "                                        </p>\n" +
                        "                                    </div>\n" +
                        "                                </div>\n" +
                        "                            </div>\n" +
                        "                        </div>\n" +
                        "                    </div>";
            }
        }
        return jsp;
    }

    public String ajaxListSite(int startingPage) {
        List<Post> posts = postRepositories.findAll();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        pagedListHolder.setPageSize(9);
        String jsp = "";
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
