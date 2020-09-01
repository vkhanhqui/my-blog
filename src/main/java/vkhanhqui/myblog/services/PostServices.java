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
    public List<Integer> pagingPageNumbers( int currentPage, PagedListHolder pagedListHolder, List<Post> posts){
        List<Integer> listElement = new ArrayList<>();
        currentPage += 1;
        for (int i = 1; i < 6; i++) {
            int currentElement = 5 * currentPage - 6 + i;
            if (currentPage >= pagedListHolder.getPageCount())
                currentElement = 5 * pagedListHolder.getPageCount() - 6 + i;
            else if (currentPage < 1)
                currentElement = 5 - 6 + i;
            if (currentElement < posts.size()) {
                listElement.add(currentElement);
            }
        }
        return listElement;
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
