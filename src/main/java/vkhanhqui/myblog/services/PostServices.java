package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import vkhanhqui.myblog.models.Category;
import vkhanhqui.myblog.models.MyUploadForm;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.CategoryRepositories;
import vkhanhqui.myblog.models.repositories.PostRepositories;
import vkhanhqui.myblog.models.repositories.UserRepositories;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Transactional
@Service
public class PostServices {
    @Autowired
    UserRepositories userRepositories;
    @Autowired
    CategoryRepositories categoryRepositories;
    @Autowired
    private PostRepositories postRepositories;

    public List<Post> getAllPosts() {
        return postRepositories.findAll();
    }

    public String savePost(String username, Post post, long categoryId, String thumbnail) {
        Category category = categoryRepositories.findById(categoryId).get();
        post.setCategory(category);
        post.setComments(null);
        post.setDate(new Date());
        post.setThumbnail(thumbnail);
        post.setUser(userRepositories.findById(username).get());
        post.setReading("12 min read");
        post.setViews((long) 0);
        String message ="<div class=\"msg success\">\r\n" + "               <li>Successfully</li>\r\n"
                + "           </div>";
        try {
            postRepositories.save(post);
        }
        catch (Exception e){
            message= "<div class=\"msg error\">\r\n" + "               <li>Something is incorrect</li>\r\n"
                    + "           </div>";
        }
        return message;
    }

    public Post getPost(long id) {
        Post post = postRepositories.findById(id).get();
        post.setViews(post.getViews() + 1);
        postRepositories.save(post);
        return post;
    }

    public void deletePost(long id) {
        postRepositories.customDeletingPostById(id);
    }

    public void deleteAllPosts() {
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

    public List<Post> getTopFiveViewedPost() {
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Optional<List<Post>> optionalPosts = postRepositories.findAllByOrderByViewsDesc();
            if (optionalPosts.isPresent())
                posts.add(i, optionalPosts.get().get(i));
        }
        return posts;
    }

    public List<Post> getPostsByRelatedWords(String keyword) {
        List<Post> posts = new ArrayList<>();
        Optional<List<Post>> optionalPosts = postRepositories.findAllByTitleContaining(keyword);
        if (optionalPosts.isPresent())
            posts = optionalPosts.get();
        return posts;
    }

    public List<Post> getAllPostsOfCurrentUser(String username) {
        List<Post> posts = new ArrayList<Post>();
        if (postRepositories.findAllByUserUsername(username).isPresent())
            posts = postRepositories.findAllByUserUsername(username).get();
        return posts;
    }

    public String uploadFile(MyUploadForm myUploadForm) {
        File uploadRootDir = new File("G:/tailieuREstore/Spring boot/my-blog/src/main/webapp/resources/images");
        CommonsMultipartFile[] fileDatas = myUploadForm.getFileDatas();
        List<File> uploadedFiles = new ArrayList<>();
        String name = "";
        for (CommonsMultipartFile fileData : fileDatas) {
            name = fileData.getOriginalFilename();
            if (name != null && name.length() > 0) {
                try {
                    File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + name);
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                    stream.write(fileData.getBytes());
                    stream.close();
                    uploadedFiles.add(serverFile);
                } catch (Exception e) {
                    System.out.println("Error Write file: " + name);
                }
            }
            name = "/resources/images/"+name;
        }
        return name;
    }
}
