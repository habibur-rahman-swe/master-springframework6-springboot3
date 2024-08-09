package com.habib.todo_app.todo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

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
	
	@GetMapping("add-todo")
	public String showNewTodoPage(ModelMap modelMap) {
		modelMap.addAttribute("todo", Todo.builder().build());
		return "todo";
	}
	
	@PostMapping("add-todo")
	public String addTodoPage(ModelMap modelMap, @Valid Todo todo, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			todo.setDescription(bindingResult.getAllErrors().toString());
			return "todo";
		}
		todoService.addTodo("in28minutes", todo.getDescription(), LocalDate.now().plusYears(1) , false);
		return "redirect:list-todos";
	}
}
