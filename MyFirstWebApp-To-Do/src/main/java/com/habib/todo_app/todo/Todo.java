package com.habib.todo_app.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Todo {
	private int id;
	private String username;
	@Size(min = 10, message = "Enter atleast 10 characters")
	private String description;
	private LocalDate localDate;
	private boolean done;
}
