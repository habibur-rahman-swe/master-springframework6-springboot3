package com.habib.todo_app.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	public List<Todo> findByUsername(String username) {
		return todoRepository.findByUsername(username);
	}
	
	public List<Todo> findAll() {
		return todoRepository.findAll();
	}
	
	public void addTodo(Todo todo) {
		Todo createdTodo = todoRepository.save(todo);
	}

	public void deleteById(Long id) {
//		todos = todos.stream().filter(todo -> todo.getId() != id).collect(Collectors.toList());
//		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//		todos.removeIf(predicate);
		todoRepository.deleteById(id);
	}

	public Todo findById(Long id) {
		//Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Optional<Todo> todo = todoRepository.findById(id);
				// todos.stream().filter(predicate).findFirst().get();
		return todo.get();
	}

	public void updateTodo(@Valid Todo todo) {
		// Todo Oldtodo = findById(todo.getId());
		// Oldtodo.setDescription(todo.getDescription());
		// Oldtodo.setLocalDate(todo.getLocalDate());
		todoRepository.save(todo);
	}
}
