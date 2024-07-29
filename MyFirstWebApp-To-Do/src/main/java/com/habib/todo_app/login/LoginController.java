package com.habib.todo_app.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	private AuthenticationService authenticationService;
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("login")
	public String goToLoginPage() {
		return "login";
	}
	
	@PostMapping("login")
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {

		if (authenticationService.authenticate(name, password)) {
			modelMap.put("name", name);
			modelMap.put("password", password);
			
			return "welcome";
		}
		
		modelMap.put("errorMessage", "Invalid Credintials! Please try again...");
		return "login";
	}
	
}
