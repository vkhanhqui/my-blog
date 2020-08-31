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

    public void pagingHomeSite(int currentPage, ModelMap modelMap) {
        currentPage -= 1;
        List<Post> posts = postRepositories.findAll();
        PagedListHolder pagedListHolder = new PagedListHolder(posts);
        pagedListHolder.setPageSize(5);
        int minPage = currentPage - 2;
        if (currentPage - 2 < 0) {
            minPage = 0;
        }
        int maxPage = currentPage + 3;
        if (currentPage + 3 > pagedListHolder.getPageCount() - 1) {
            maxPage = pagedListHolder.getPageCount();
        }
        modelMap.addAttribute("minPage", minPage);
        modelMap.addAttribute("maxPage", maxPage);
        modelMap.addAttribute("currentPage", currentPage);
        modelMap.addAttribute("pagedListHolder", pagedListHolder);
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
        modelMap.addAttribute("listElement", listElement);
        modelMap.addAttribute("posts", posts);
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
