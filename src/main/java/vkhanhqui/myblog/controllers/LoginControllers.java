package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import vkhanhqui.myblog.services.MemberServices;

@Controller
@RequestMapping("sign-in")
@SessionAttributes("username")
public class LoginControllers {
    @Autowired
    MemberServices memberServices;

    @GetMapping
    public String getLoginSite(ModelMap modelMap) {
    	String error= "";
    	modelMap.addAttribute("error",error);
        return "sign-in";
    }

    @PostMapping
    public String doLogin(@RequestParam String username, @RequestParam String password, ModelMap modelMap) { 	
    	if(!memberServices.getOptionalMember(username, password).isPresent()) {
    		String error = "<div class=\"msg error\">\r\n" + 
    				"               <li>Username or Password is incorrect</li>\r\n" + 
    				"           </div>";
        	modelMap.addAttribute("error",error);
        	return "sign-in";
    	}
    	else {
    		modelMap.addAttribute("username",username);
    		return "redirect:/";
    	}
    }

}

