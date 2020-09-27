package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import vkhanhqui.myblog.models.Category;
import vkhanhqui.myblog.models.MyUploadForm;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.models.repositories.CategoryRepositories;
import vkhanhqui.myblog.models.repositories.PostRepositories;
import vkhanhqui.myblog.models.repositories.UserRepositories;

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

    public List<PostDTO> getAllPosts() {
        return postRepositories.findAllPosts();
    }

    public String savePost(String username, Post post, long categoryId, String thumbnail) {
        Category category = categoryRepositories.findById(categoryId).get();
        post.setCategory(category);
        post.setComments(null);
        post.setDate(new Date());
        post.setThumbnail(thumbnail);
        post.setUser(userRepositories.findById(username).get());
        post.setReading_time("12 min read");
        post.setViews((long) 0);
        String message = "<div class=\"msg success\">\r\n" + "               <li>Successfully</li>\r\n"
                + "           </div>";
        try {
            postRepositories.save(post);
        } catch (Exception e) {
            message = "<div class=\"msg error\">\r\n" + "               <li>Something is incorrect</li>\r\n"
                    + "           </div>";
        }
        return message;
    }

    public String editPost(long id, Post post, long categoryId, String thumbnail) {
        Post postNeedToUpdate = postRepositories.findById(id).get();
        Category category = categoryRepositories.findById(categoryId).get();
        postNeedToUpdate.setCategory(category);
        postNeedToUpdate.setDate(new Date());
        postNeedToUpdate.setThumbnail(thumbnail);
        postNeedToUpdate.setTitle(post.getTitle());
        postNeedToUpdate.setContent(post.getContent());
        postNeedToUpdate.setDescription(post.getDescription());
        String message = "<div class=\"msg success\">\r\n" + "               <li>Successfully</li>\r\n"
                + "           </div>";
        try {
            postRepositories.save(postNeedToUpdate);
        } catch (Exception e) {
            message = "<div class=\"msg error\">\r\n" + "               <li>Something is incorrect</li>\r\n"
                    + "           </div>";
        }
        return message;
    }

    public PostDTO getPost(long id) {
        Post post = postRepositories.findById(id).get();
        post.setViews(post.getViews()+1);
        postRepositories.save(post);
        return new PostDTO(post.getId(),post.getTitle(),post.getDescription()
                ,post.getContent(),post.getDate(),post.getReading_time(),post.getThumbnail(),post.getViews(),post.getUser()
        );
    }

    public void deletePost(long id) {
        postRepositories.customDeletingPostById(id);
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

    public List<PostDTO> getTop3ViewedPost() {
        return postRepositories.findTop3ByOrderByViewsDesc(PageRequest.of(0, 3));
    }

    public List<PostDTO> getTop5ViewedPost() {
        return postRepositories.findTop5ByOrderByViewsDesc(PageRequest.of(0, 5));
    }

    public List<PostDTO> getAllPostsByNameOfCategory(String nameOfCategory) {
        return postRepositories.findAllByCategoryName(nameOfCategory);
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
            name = "/resources/images/" + name;
        }
        return name;
    }
}
