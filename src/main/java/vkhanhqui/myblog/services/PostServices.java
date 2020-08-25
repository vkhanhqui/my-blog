package vkhanhqui.myblog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;


@Service
public class PostServices {
	@Autowired
	private PostRepositories postRepository;
	
	@Transactional
	public List<Post> getposts(){
		return postRepository.findAll();
	}
	
	@Transactional
	public void savepost(Post post){
		postRepository.save(post);
	}
	
	@Transactional
	public Post getpost(int id){
		return postRepository.findById(id).get();
	}
	
	@Transactional
	public void deletepost(int id){
		postRepository.deleteById(id);;
	}
}
