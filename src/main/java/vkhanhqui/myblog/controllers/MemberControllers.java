package vkhanhqui.myblog.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member")
public class MemberControllers {

    @GetMapping("posts/index")
    public String getPostManagementSite(ModelMap modelMap,Principal principal) {
        if(principal!=null) {
            String username = principal.getName();
            modelMap.addAttribute("username", username);
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
