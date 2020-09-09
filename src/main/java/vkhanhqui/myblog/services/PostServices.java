package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Post post = postRepositories.findById(id).get();
        post.setViews(post.getViews() + 1);
        postRepositories.save(post);
        return post;
    }

    public void deleteAPost(long id) {
        postRepositories.deleteById(id);
    }

    public void deleteAllPost() {
        postRepositories.deleteAll();
    }

    public PagedListHolder getPagingSite(int currentPage
            , PagedListHolder pagedListPost) {
        if (currentPage < 2)
            currentPage = 1;
        else if (currentPage > pagedListPost.getPageCount())
            currentPage = pagedListPost.getPageCount();
        pagedListPost.setPage(currentPage - 1);
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = currentPage; i <= pagedListPost.getPageCount(); i++) {
            numbers.add(i);
        }
        PagedListHolder pagedListNumber = new PagedListHolder(numbers);
        pagedListNumber.setPageSize(5);
        return pagedListNumber;
    }

    public List<Post> getTheMostViewedPost() {
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Optional<List<Post>> optionalPosts = postRepositories.findAllByOrderByViewsDesc();
            if (optionalPosts.isPresent())
                posts.add(i, optionalPosts.get().get(i));
        }
        return posts;
    }

    public List<Post> getPostsByRelatedWords(String keyword) {
        List<Post> posts = new ArrayList<>();
        Optional<List<Post>> optionalPosts = postRepositories.findAllByTitleContaining(keyword);
        if(optionalPosts.isPresent())
            posts= optionalPosts.get();
        return posts;
    }
}
