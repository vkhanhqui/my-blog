package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;

import java.util.List;

@Transactional
@Service
public class PostServices {
    @Autowired
    private PostRepositories postRepository;

    public List<Post> getPosts(){
        return postRepository.findAll();
    }

    public void saveAPost(Post post){
        postRepository.save(post);
    }

    public Post getAPost(int id){
        return postRepository.findById(id).get();
    }

    public void deleteAPost(int id){
        postRepository.deleteById(id);
    }

}
