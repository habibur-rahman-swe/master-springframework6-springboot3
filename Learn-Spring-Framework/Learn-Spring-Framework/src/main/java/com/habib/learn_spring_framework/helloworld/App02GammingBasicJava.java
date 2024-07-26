package com.habib.learn_spring_framework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GammingBasicJava {
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			/*
			 * System.out.println(context.getBean("name"));
			 * System.out.println(context.getBean("age"));
			 * System.out.println(context.getBean("person"));
			 * System.out.println(context.getBean("address2"));
			 */
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
		
	}
}
