package vkhanhqui.myblog.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.services.PostServices;

@Controller
@RequestMapping("member")
public class MemberControllers {

	@Autowired
	PostServices postServices;
	
    @GetMapping("posts/index")
    public String getPostManagementSite(ModelMap modelMap,Principal principal) {
        if(principal!=null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
        	List<Post> posts = postServices.getAllPostsOfCurrentUser(username);
        	modelMap.addAttribute("posts", posts);
        }
        return "member/posts/index";
    }

    @GetMapping("posts/create")
    public String getCreatingPostSite(ModelMap modelMap,Principal principal) {
        if(principal!=null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
        }
        return "member/posts/create";
    }

}
