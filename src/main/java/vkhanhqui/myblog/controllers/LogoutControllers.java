package vkhanhqui.myblog.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("logout")
public class LogoutControllers {
	
	@GetMapping
	public String doLogout(HttpSession httpSession) {
    	httpSession.removeAttribute("username");
    	return "redirect:/";
	}
}
