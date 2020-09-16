package vkhanhqui.myblog.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminControllers {
	
	@GetMapping("posts/index")
	public String getPostManagementSite(ModelMap modelMap,Principal principal) {
		if(principal!=null) {
        	String username = principal.getName();
        	modelMap.addAttribute("username", username);
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
