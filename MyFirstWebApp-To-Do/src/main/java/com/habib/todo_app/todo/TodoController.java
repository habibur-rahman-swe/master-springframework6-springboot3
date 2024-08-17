package com.habib.todo_app.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	@GetMapping("list-todos")
	public String listAllTodos(ModelMap modelMap) {
		String username = getLooggedInUsername(modelMap);
		List<Todo> todos = todoService.findByUsername(username);
		modelMap.put("todos", todos);
		return "listTodos";
	}

	
	@GetMapping("add-todo")
	public String showNewTodoPage(ModelMap modelMap) {
		modelMap.addAttribute("todo", new Todo());
		return "todo";
	}
	
	@PostMapping("add-todo")
	public String addTodoPage(ModelMap modelMap, @Valid Todo todo, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			todo.setDescription(bindingResult.getAllErrors().toString());
			return "todo";
		}
		
		todoService.addTodo(todo);
		return "redirect:list-todos";
	}
	
	@GetMapping("delete-todo")
	public String deleteTodo(@RequestParam Long id) {
		todoService.deleteById(id);
		return "redirect:list-todos";
	}
	
	@GetMapping("update-todo")
	public String updateTodo(@RequestParam Long id, ModelMap modelMap) {
		Todo todo = todoService.findById(id);
		modelMap.addAttribute("todo", todo);
		return "todo";
	}
	
	@PostMapping("update-todo")
	public String updateTodo(ModelMap modelMap, @Valid Todo todo, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			todo.setDescription(bindingResult.getAllErrors().toString());
			return "todo";
		}
		
		todoService.updateTodo(todo);
		
		return "redirect:list-todos";
	}
	
	private String getLooggedInUsername(ModelMap modelMap) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName(); 
	}
}
