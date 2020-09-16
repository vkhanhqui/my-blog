package vkhanhqui.myblog.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import vkhanhqui.myblog.models.User;
import vkhanhqui.myblog.models.UserDetailsDTO;


@SessionAttributes({ "currentUser" })
@Controller
@RequestMapping("user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    /**
     * This method handles login GET requests. If users is already logged-in and
     * tries to goto login page again, will be redirected to list page.
     */
    @GetMapping("login")
    public String loginPage(Principal principal) {
        return principal == null ? "login" : "redirect:/";
    }

    @PostMapping("postLogin")
    public void postLogin(Model model, HttpSession session) {
        log.info("postLogin()");
        // read principal out of security context and set it to session
        UsernamePasswordAuthenticationToken authentication 
        	= (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        validatePrinciple(authentication.getPrincipal());
        User loggedInUser = ((UserDetailsDTO) authentication.getPrincipal()).getUser();
        model.addAttribute("currentUser", loggedInUser.getUsername());
        session.setAttribute("userId", loggedInUser.getUsername());

    }

    private void validatePrinciple(Object principal) {
        if (!(principal instanceof UserDetailsDTO)) {
            throw new IllegalArgumentException("Principal can not be null!");
        }
    }

    @RequestMapping(value = "loginFailed", method = RequestMethod.GET)
    public String loginError(Model model) {
        log.info("Login attempt failed");
        model.addAttribute("error", "true");
        return "login";
    }

    /**
     * This method handles logout requests. Toggle the handlers if you are
     * RememberMe functionality is useless in your app.
     */
    @GetMapping("logout")
    public ModelAndView logoutPage(SessionStatus session) {
        SecurityContextHolder.getContext().setAuthentication(null);
        session.setComplete();

        return new ModelAndView("login");
    }

}
