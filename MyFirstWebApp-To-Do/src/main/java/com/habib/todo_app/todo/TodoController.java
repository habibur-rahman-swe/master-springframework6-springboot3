package com.habib.todo_app.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	@GetMapping("list-todos")
	public String listAllTodos(ModelMap modelMap) {
		modelMap.put("todos", todoService.findAll());
		return "listTodos";
	}
	
}
