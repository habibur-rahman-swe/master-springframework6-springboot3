package com.habib.todo_app.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	
	private static Long todosCount = 0l;
	
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

	public void deleteById(Long id) {
//		todos = todos.stream().filter(todo -> todo.getId() != id).collect(Collectors.toList());
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(Long id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		Todo Oldtodo = findById(todo.getId());
		Oldtodo.setDescription(todo.getDescription());
		Oldtodo.setLocalDate(todo.getLocalDate());
	}
}
