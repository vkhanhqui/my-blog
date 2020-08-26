package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.PostServices;

import java.util.List;

@Controller
@RequestMapping("list")
public class ListControllers {
	@Autowired
	private PostServices postService;

	@GetMapping
	public String getLoginPage(Model model) {
		List<Post> posts = postService.getPosts();
		model.addAttribute("posts", posts);
		return "list";
	}
}
