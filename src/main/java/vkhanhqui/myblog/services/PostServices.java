package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import vkhanhqui.myblog.models.dtos.PostDTO;
import vkhanhqui.myblog.models.entities.Category;
import vkhanhqui.myblog.models.entities.MyUploadForm;
import vkhanhqui.myblog.models.entities.Post;
import vkhanhqui.myblog.models.repositories.CategoryRepositories;
import vkhanhqui.myblog.models.repositories.PostRepositories;
import vkhanhqui.myblog.models.repositories.UserRepositories;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Transactional
@Service
public class PostServices {
    @Autowired
    UserRepositories userRepositories;
    @Autowired
    CategoryRepositories categoryRepositories;
    @Autowired
    private PostRepositories postRepositories;

    public List<PostDTO> getAllPostsForHome() {
        return postRepositories.findAllPostsForHomeSite();
    }

    public List<PostDTO> getAllPostsForAdmin() {
        return postRepositories.findAllPostsForAdminSite();
    }

    public void createPost(String username, Post post, long categoryId, String thumbnail) {
        Category category = categoryRepositories.findById(categoryId).get();
        Post newPost = new Post(new Random().nextLong(), post.getTitle(), post.getDescription()
                , post.getContent(), new Date(), thumbnail
                , (long) 0, category, null
                , userRepositories.findById(username).get()
        );
        postRepositories.save(newPost);
    }

    public void editPost(long id, Post post, long categoryId, String thumbnail) {
        Post postNeedToUpdate = postRepositories.findById(id).get();
        Category category = categoryRepositories.findById(categoryId).get();
        Post newPost = new Post(id, post.getTitle(), post.getDescription()
                , post.getContent(), new Date(), thumbnail
                , (long) 0, category, postNeedToUpdate.getComments()
                , postNeedToUpdate.getUser()
        );
            postRepositories.save(newPost);
    }

    public PostDTO getPost(long id) {
        return postRepositories.findPostById(id);
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

    public List<PostDTO> getTop3Post() {
        return postRepositories.findTop3ByOrderByViewsDesc(PageRequest.of(0, 3));
    }

    public List<PostDTO> getTop5Post() {
        return postRepositories.findTop5ByOrderByViewsDesc(PageRequest.of(0, 5));
    }

    public List<PostDTO> getPostsByRelatedWords(String keyword) {
        return postRepositories.findAllByTitleContaining(keyword);
    }

    public List<PostDTO> getAllPostsOfCurrentUser(String username) {
        return postRepositories.findAllByUserUsername(username);
    }

    public List<PostDTO> getPostsByCategory(Long category_id){
        return postRepositories.findAllByCategoryName(category_id);
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
