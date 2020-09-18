package vkhanhqui.myblog.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vkhanhqui.myblog.services.PostServices;
import vkhanhqui.myblog.services.UserServices;

@Controller
@RequestMapping("manage")
public class ManagementControllers {
	
	@Autowired
	UserServices userServices;
	
	@Autowired
	PostServices postServices;
	
	@GetMapping("delete-user/{username}")
	public String deleteUser(@PathVariable String username) {
		userServices.deleteUser(username);
		return "redirect:/admin/users/index";
	}
	
	@GetMapping("delete-post/{id}")
	public String deletePost(@PathVariable long id, HttpSession httpSession){
		postServices.deletePost(id);
    	String role = httpSession.getAttribute("role").toString();
    	if(role.equals("admin"))
    		return "redirect:/admin/posts/index";
    	else
    		return "redirect:/member/posts/index";
	}
}
