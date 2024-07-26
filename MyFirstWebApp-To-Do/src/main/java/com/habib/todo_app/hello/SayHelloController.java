package com.habib.todo_app.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@GetMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are your learning today?";
	}
	
	@GetMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		return """
				<h1>Hello! What are your learning today?</h1>
				""";
	}
	
	@GetMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
