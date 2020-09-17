package vkhanhqui.myblog.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import vkhanhqui.myblog.models.User;
import vkhanhqui.myblog.models.UserDetailsDTO;
import vkhanhqui.myblog.services.UserServices;



@Controller
@RequestMapping("sign-in")
@SessionAttributes({ "currentUser" })
public class LoginControllers {
	

	private void validatePrinciple(Object principal) {
        if (!(principal instanceof UserDetailsDTO)) {
            throw new IllegalArgumentException("Principal can not be null!");
        }
    }
	
    @GetMapping
    public String loginPage(Principal principal) {
        return principal == null ? "sign-in" : "redirect:/";
    }

    @PostMapping
    public void postLogin(Model model, HttpSession session) {
        UsernamePasswordAuthenticationToken authentication 
        	= (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        validatePrinciple(authentication.getPrincipal());
        User loggedInUser = ((UserDetailsDTO) authentication.getPrincipal()).getUser();
        model.addAttribute("currentUser", loggedInUser.getUsername());
        session.setAttribute("userId", loggedInUser.getUsername());

    }
    
    @GetMapping("loginFailed")
    public String loginError(Model model) {
        model.addAttribute("error", "true");
        return "sign-in";
    }

    @GetMapping("logout")
    public ModelAndView logoutPage(SessionStatus session) {
        SecurityContextHolder.getContext().setAuthentication(null);
        session.setComplete();

        return new ModelAndView("redirect:/");
    }


}

