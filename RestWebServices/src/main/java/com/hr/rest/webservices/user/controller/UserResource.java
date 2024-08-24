package com.hr.rest.webservices.user.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hr.rest.webservices.entity.User;
import com.hr.rest.webservices.user.service.UserModelService;

@RestController
public class UserResource {
	/*
	 * 404 -> Resource is not found
	 * 500 -> Server Exception
	 * 400 -> validation Error
	 * 200 -> Success
	 * 204 -> No content
	 * 401 -> Unauthorized
	 * 400 -> Bad Request
	 * 404 -> Resource Not Found
	 * 500 -> Server Error
	 * 
	 */
	
	private UserModelService service;

	public UserResource(UserModelService userModelService) {
		this.service = userModelService;
	}
	
	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retriveAllUser(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		
		User savedUser = service.save(user);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
}
