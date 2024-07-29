package com.habib.todo_app.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(Todo.builder().id(1).username("in28minutes").description("AWS").localDate(LocalDate.now().plusYears(1)).done(false).build());
		todos.add(Todo.builder().id(2).username("in28minutes").description("AWS").localDate(LocalDate.now().plusYears(1)).done(false).build());
		todos.add(Todo.builder().id(3).username("in28minutes").description("AWS").localDate(LocalDate.now().plusYears(1)).done(false).build());
		todos.add(Todo.builder().id(4).username("in28minutes").description("AWS").localDate(LocalDate.now().plusYears(1)).done(false).build());
		todos.add(Todo.builder().id(5).username("in28minutes").description("AWS").localDate(LocalDate.now().plusYears(1)).done(false).build());
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public List<Todo> findAll() {
		return todos;
	}
}
