package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;

import java.util.List;

@Service
public class PostServices{
    @Autowired
    private PostRepositories postRepository;

    @Transactional
    public List<Post> getPosts(){
        return postRepository.findAll();
    }

    @Transactional
    public void saveAPost(Post post){
        postRepository.save(post);
    }

    @Transactional
    public Post getAPost(int id){
        return postRepository.findById(id).get();
    }

    @Transactional
    public void deleteAPost(int id){
        postRepository.deleteById(id);
    }
}