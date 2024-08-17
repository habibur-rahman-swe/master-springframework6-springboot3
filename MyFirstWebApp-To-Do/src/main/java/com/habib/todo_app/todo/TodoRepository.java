package com.habib.todo_app.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>{

	public List<Todo> findByUsername(String username);
	
}
