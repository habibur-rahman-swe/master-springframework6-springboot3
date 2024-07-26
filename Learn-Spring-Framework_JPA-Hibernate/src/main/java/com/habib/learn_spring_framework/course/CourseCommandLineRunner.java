package com.habib.learn_spring_framework.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJpaRepository courseJpaRepository;

	@Autowired
	private CourseSpringDataJpaRepository courseSpringDataJpaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		courseSpringDataJpaRepository.save(new Course(1l, "H", "A"));
		courseSpringDataJpaRepository.save(new Course(2l, "A", "A"));
		courseSpringDataJpaRepository.save(new Course(3l, "B", "A"));
		courseSpringDataJpaRepository.save(new Course(4l, "I", "A"));
		courseSpringDataJpaRepository.save(new Course(5l, "B", "A"));
		
		courseSpringDataJpaRepository.deleteById(3l);
		
		System.out.println(courseSpringDataJpaRepository.findAll());
		System.out.println(courseSpringDataJpaRepository.count());
		
		System.out.println("Find by Author: " + courseSpringDataJpaRepository.findByAuthor("A"));
		System.out.println("Find by Name: " + courseSpringDataJpaRepository.findByName("A"));
	}

}
