package com.habib.learn_spring_framework;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@GetMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(new Course(1l, "Learn AWS", "in28minutes"),
				new Course(2l, "Learn AWS", "in28minutes"),
				new Course(2l, "Learn AWS", "in28minutes"),
				new Course(2l, "Learn AWS", "in28minutes"),
				new Course(2l, "Learn AWS", "in28minutes"));
	}
}
