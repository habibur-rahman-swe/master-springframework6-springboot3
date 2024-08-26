package com.hr.rest.webservices.entity;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private Long id;
	@Size(min=2)
	private String name;
	@Past(message = "Birth Date should be in past.")
	private LocalDate birthDate;
	
}
