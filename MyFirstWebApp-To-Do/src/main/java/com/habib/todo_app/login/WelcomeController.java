package com.habib.todo_app.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

	@GetMapping("/")
	public String goWelcomePage(ModelMap modelMap) {
		modelMap.put("name", "in28minutes");
		return "welcome";
	}
	
}
