
package vkhanhqui.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contact")
public class ContactControllers {
	@GetMapping
	public String getLoginPage() {
		return "contact";
	}
}
