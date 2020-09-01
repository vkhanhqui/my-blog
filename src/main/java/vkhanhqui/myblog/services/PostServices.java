package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;

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

    public List<Integer> pagingPageNumbersOfHomeSite(int currentPage, PagedListHolder pagedListHolder, List<Post> posts) {
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

    public List<Integer> pagingPageNumbersOfListSite(int currentPage, PagedListHolder pagedListHolder, List<Post> posts) {
        List<Integer> listElement = new ArrayList<>();
        currentPage += 1;
        for (int i = 1; i < 7; i++) {
            int currentElement = 6 * currentPage - 7 + i;
            if (currentPage >= pagedListHolder.getPageCount())
                currentElement = 6 * pagedListHolder.getPageCount() - 7 + i;
            else if (currentPage < 1)
                currentElement = 6 - 7 + i;
            if (currentElement < posts.size()) {
                listElement.add(currentElement);
            }
        }
        return listElement;
    }
}
