package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
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
        List<Post> posts = postRepositories.findAll();
        List<PostDTO> postDTOS = new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            postDTOS.add(i, new PostDTO(post.getId(), post.getTitle()
                    , post.getDescription(), null, post.getDate()
                    , post.getReading(), post.getThumbnail(), null, post.getUser().getUsername()
            ));
        }
        return postDTOS;
    }

    public String savePost(String username, Post post, long categoryId, String thumbnail) {
        Category category = categoryRepositories.findById(categoryId).get();
        Post newPost = new Post(post.getId(), post.getTitle(), post.getDescription()
                , post.getContent(), new Date(), "12 min read", thumbnail
                , (long) 0, category, null
                , userRepositories.findById(username).get()
        );
        String message = "<div class=\"msg success\">\r\n" + "               <li>Successfully</li>\r\n"
                + "           </div>";
        try {
            postRepositories.save(newPost);
        } catch (Exception e) {
            message = "<div class=\"msg error\">\r\n" + "               <li>Something is incorrect</li>\r\n"
                    + "           </div>";
        }
        return message;
    }

    public String editPost(long id, Post post, long categoryId, String thumbnail) {
        Post postNeedToUpdate = postRepositories.findById(id).get();
        Category category = categoryRepositories.findById(categoryId).get();
        Post newPost = new Post(id, post.getTitle(), post.getDescription()
                , post.getContent(), new Date(), "12 min read", thumbnail
                , (long) 0, category, postNeedToUpdate.getComments()
                , postNeedToUpdate.getUser()
        );
        String message = "<div class=\"msg success\">\r\n" + "               <li>Successfully</li>\r\n"
                + "           </div>";
        try {
            postRepositories.save(newPost);
        } catch (Exception e) {
            message = "<div class=\"msg error\">\r\n" + "               <li>Something is incorrect</li>\r\n"
                    + "           </div>";
        }
        return message;
    }

    public PostDTO getPost(long id) {
        Post post = postRepositories.findById(id).get();
        PostDTO postDTO = new PostDTO(post.getId(), post.getTitle()
                , post.getDescription(), post.getContent(), post.getDate()
                , post.getReading(), post.getThumbnail(), post.getViews(), post.getUser().getUsername()
        );
        post.setViews(post.getViews() + 1);
        postRepositories.save(post);
        return postDTO;
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

    public List<PostDTO> getTheMostViewedPost() {
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Optional<List<Post>> optionalPosts = postRepositories.findAllByOrderByViewsDesc();
            if (optionalPosts.isPresent())
                posts.add(i, optionalPosts.get().get(i));
        }
        List<PostDTO> postDTOS = new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            postDTOS.add(i, new PostDTO(post.getId(), post.getTitle()
                    , null, null, null
                    ,null, post.getThumbnail(), null, null
            ));
        }
        return postDTOS;
    }

    public List<PostDTO> getTopFiveViewedPost() {
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Optional<List<Post>> optionalPosts = postRepositories.findAllByOrderByViewsDesc();
            if (optionalPosts.isPresent())
                posts.add(i, optionalPosts.get().get(i));
        }
        List<PostDTO> postDTOS = new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            postDTOS.add(i, new PostDTO(post.getId(), post.getTitle()
                    , null, null, post.getDate()
                    , null, post.getThumbnail(), null, post.getUser().getUsername()
            ));
        }
        return postDTOS;
    }

    public List<PostDTO> getPostsByRelatedWords(String keyword) {
        List<Post> posts = new ArrayList<>();
        Optional<List<Post>> optionalPosts = postRepositories.findAllByTitleContaining(keyword);
        if (optionalPosts.isPresent())
            posts = optionalPosts.get();
        List<PostDTO> postDTOS = new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            postDTOS.add(i, new PostDTO(post.getId(), post.getTitle()
                    , post.getDescription(), post.getContent(), post.getDate()
                    , post.getReading(), post.getThumbnail(), post.getViews(), post.getUser().getUsername()
            ));
        }
        return postDTOS;
    }

    public List<PostDTO> getAllPostsOfCurrentUser(String username) {
        List<Post> posts = new ArrayList<Post>();
        if (postRepositories.findAllByUserUsername(username).isPresent())
            posts = postRepositories.findAllByUserUsername(username).get();
        List<PostDTO> postDTOS = new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            postDTOS.add(i, new PostDTO(post.getId(), post.getTitle()
                    , post.getDescription(), post.getContent(), post.getDate()
                    , post.getReading(), post.getThumbnail(), post.getViews(), post.getUser().getUsername()
            ));
        }
        return postDTOS;
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
