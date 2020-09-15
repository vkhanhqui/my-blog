package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Member;
import vkhanhqui.myblog.services.MemberServices;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("sign-in")
public class LoginControllers {
    @Autowired
    MemberServices memberServices;

    @GetMapping
    public String getLoginSite(ModelMap modelMap) {
        modelMap.put("member", new Member());
        return "sign-in";
    }

    @PostMapping
    public String doLogin(ModelMap modelMap, HttpSession session, @ModelAttribute("member") Member member) {
        Optional<Member> optionalMember = memberServices.getOptionalMember(member.getUsername(), member.getPassword());
        if (!optionalMember.isPresent()) {
            modelMap.put("member", new Member());
            modelMap.put("msg", "The username or password is incorrect!");
            session.setAttribute("myLogin", null);
            return "sign-in";
        }
        session.setAttribute("myLogin", optionalMember.get());
        return "redirect:/";
    }

}

