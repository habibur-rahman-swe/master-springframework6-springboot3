package com.habib.todo_app.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	
	private static int todosCount = 0;
	
	static {
		todos.add(Todo.builder().id(++todosCount).username("in28minutes").description("AWS").localDate(LocalDate.now().plusYears(1)).done(false).build());
		todos.add(Todo.builder().id(++todosCount).username("in28minutes").description("AWS").localDate(LocalDate.now().plusYears(1)).done(false).build());
		todos.add(Todo.builder().id(++todosCount).username("in28minutes").description("AWS").localDate(LocalDate.now().plusYears(1)).done(false).build());
		todos.add(Todo.builder().id(++todosCount).username("in28minutes").description("AWS").localDate(LocalDate.now().plusYears(1)).done(false).build());
		todos.add(Todo.builder().id(++todosCount).username("in28minutes").description("AWS").localDate(LocalDate.now().plusYears(1)).done(false).build());
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public List<Todo> findAll() {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = Todo.builder().id(++todosCount).username("in28minutes").description(description).localDate(targetDate).done(false).build();
		todos.add(todo);
	}
}
