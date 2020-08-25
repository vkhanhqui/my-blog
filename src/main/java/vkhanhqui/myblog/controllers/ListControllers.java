package vkhanhqui.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("list")
public class ListControllers {
	@GetMapping
	public String getLoginPage() {
		return "list";
	}
}
