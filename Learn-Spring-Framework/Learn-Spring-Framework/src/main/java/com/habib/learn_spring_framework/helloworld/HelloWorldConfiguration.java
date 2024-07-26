package com.habib.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    String name() {
		return "Ranga";
	}
    
    @Bean
    int age() {
    	return 180;
    }
	
    @Bean
    Person person() {
    	var person = new Person("Ravi", 20);
		return person;
    }
    
    @Bean("address2")
    Address address() {
    	var address = new Address("First Lane, Dhaka", "KuttaLigue");
    	return address;
    }
    
    @Bean("address2")
    Address address2() {
    	var address = new Address("First Lane, Dhaka", "KuttaLigue");
    	return address;
    }
}
