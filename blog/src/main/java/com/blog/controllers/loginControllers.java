package com.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("login")
public class loginControllers {
	@GetMapping
	public String getLoginPage() {
		return "login";
	}

	@PostMapping
	public String resolveLogin(@RequestParam String username, @RequestParam String pass) {
		if (username.equals("vo khanh qui") && pass.equals("123")) {
			return "redirect:/";
		} else {
			return "login";
		}
	}
}
