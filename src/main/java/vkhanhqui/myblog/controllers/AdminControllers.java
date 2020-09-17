package vkhanhqui.myblog.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.User;
import vkhanhqui.myblog.services.PostServices;
import vkhanhqui.myblog.services.UserServices;

@Controller
@RequestMapping("admin")
public class AdminControllers {
	@Autowired
	UserServices userServices;
	
	@Autowired
	PostServices postServices;
	
	@GetMapping("posts/index")
	public String getPostManagementSite(ModelMap modelMap,Principal principal) {
		if(principal!=null) {
        	String username = principal.getName();
        	modelMap.addAttribute("username", username);
        	List<Post> posts = postServices.getAllPosts();
        	modelMap.addAttribute("posts", posts);
    	}
		return "admin/posts/index";
	}
	
	@GetMapping("posts/create")
	public String getCreatingPostSite(ModelMap modelMap,Principal principal) {
		if(principal!=null) {
        	String username = principal.getName();
        	modelMap.addAttribute("username", username);
    	}
		return "admin/posts/create";
	}
	
	@GetMapping("users/index")
	public String getUserManagementSite(ModelMap modelMap,Principal principal) {
		if(principal!=null) {
        	String username = principal.getName();
        	modelMap.addAttribute("username", username);
        	List<User> users = userServices.getAllUsersExceptCurrentUser(username);
        	modelMap.addAttribute("users", users);
    	}
		return "admin/users/index";
	}
	
	@GetMapping("users/create")
	public String getCreatingUserSite(ModelMap modelMap,Principal principal) {
		if(principal!=null) {
        	String username = principal.getName();
        	modelMap.addAttribute("username", username);
    	}
		return "admin/users/create";
	}
}
