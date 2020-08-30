package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestUtils;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class PostServices {
    @Autowired
    private PostRepositories postRepositories;

    public List<Post> getPosts() {
        return postRepositories.findAll();
    }

    public void saveAPost(Post post) {
        postRepositories.save(post);
    }

    public Post getAPost(long id) {
        return postRepositories.findById(id).get();
    }

    public void deleteAPost(long id) {
        postRepositories.deleteById(id);
    }

    public void createPosts() {
        List<Post> list = new ArrayList<>();
        for (long i = 1; i <= 9; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_1.jpg"
                    , "detail", null, null, null));
        }
        for (long i = 10; i <= 18; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_2.jpg"
                    , "detail", null, null, null));
        }
        for (long i = 19; i <= 27; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_3.jpg"
                    , "detail", null, null, null));
        }
        for (long i = 28; i <= 36; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_4.jpg"
                    , "detail", null, null, null));
        }
        for (long i = 37; i <= 45; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_5.jpg"
                    , "detail", null, null, null));
        }
        for (long i = 46; i <= 48; i++) {
            list.add(new Post(i, "title", "description", "contenttttttttcontenttttttttcontenttttttttcontentttttttt"
                    , new Date(), "12 min read"
                    , "/resources/homePage/images/image_6.jpg"
                    , "detail", null, null, null));
        }
        postRepositories.saveAll(list);
    }

    public void pagingHomeSite(HttpServletRequest request, ModelMap modelMap) {
        List<Post> posts = postRepositories.findAll();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        int page = ServletRequestUtils.getIntParameter(request, "p", 0);
        pagedListHolder.setPage(page);
        pagedListHolder.setPageSize(5);
        modelMap.put("pagedListHolder", pagedListHolder);
    }

    public void pagingListSite(HttpServletRequest request, ModelMap modelMap) {
        List<Post> posts = postRepositories.findAll();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        int page = ServletRequestUtils.getIntParameter(request, "p", 0);
        pagedListHolder.setPage(page);
        pagedListHolder.setPageSize(9);
        modelMap.put("pagedListHolder", pagedListHolder);
    }
}
