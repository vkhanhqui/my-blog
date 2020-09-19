package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vkhanhqui.myblog.services.UserServices;

@Controller
@RequestMapping("sign-up")
public class RegisterControllers {
    @Autowired
    UserServices userServices;

    @GetMapping
    public String getRegisterSite(ModelMap modelMap) {
    	String message="";
    	modelMap.addAttribute("message",message);
        return "sign-up";
    }

    @PostMapping
    public String createMember(@RequestParam String username
    		, @RequestParam String email
    		, @RequestParam String password
    		, @RequestParam String passwordConfirmation
    		, ModelMap modelMap) {
    	String message=userServices.checkSignUp(username, email, password, passwordConfirmation, "MEMBER");
		modelMap.addAttribute("message",message);
        return "sign-up";
    }
}
