package vkhanhqui.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeControllers {

	@GetMapping
	public String getHomePage() {

		return "home";
	}
}