package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vkhanhqui.myblog.models.Member;
import vkhanhqui.myblog.services.MemberServices;

@Controller
@RequestMapping("sign-up")
public class RegisterControllers {
    @Autowired
    MemberServices memberServices;

    @GetMapping
    public String getRegisterSite(ModelMap modelMap) {
    	String error= "";
    	modelMap.addAttribute("error",error);
    	String success= "";
    	modelMap.addAttribute("success",success);
        return "sign-up";
    }

    @PostMapping
    public String createMember(@RequestParam String username
    		, @RequestParam String email
    		, @RequestParam String password
    		, @RequestParam String passwordConfirmation
    		, ModelMap modelMap) {
    	String error="";
    	if(username.equals("")) {
    		error = "<div class=\"msg error\">\r\n" + 
    				"               <li>Username is required</li>\r\n" + 
    				"           </div>";
    	}
    	else if(!memberServices.isEmail(email)) {
    		error = "<div class=\"msg error\">\r\n" + 
    				"               <li>Email is wrong</li>\r\n" + 
    				"           </div>";
    	}
    	else if(!password.equals(passwordConfirmation)) {
    		error = "<div class=\"msg error\">\r\n" + 
    				"               <li>Password confirmation is wrong</li>\r\n" + 
    				"           </div>";
    	}
    	else {
    		memberServices.createMember(username,email,password);
			String success="<div class=\"msg success\">\r\n" + 
    				"               <li>Sign up successfully</li>\r\n" + 
    				"           </div>";
			modelMap.addAttribute("success",success);
    	}
		modelMap.addAttribute("error",error);
        return "sign-up";
    }
}
