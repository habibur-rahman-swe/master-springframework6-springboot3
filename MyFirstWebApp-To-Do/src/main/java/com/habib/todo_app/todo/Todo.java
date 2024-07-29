package com.habib.todo_app.todo;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Todo {
	private int id;
	private String username;
	private String description;
	private LocalDate localDate;
	private boolean done;
}
