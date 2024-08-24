package com.hr.rest.webservices.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private Long id;
	private String name;
	private LocalDate birthDate;
	
}
