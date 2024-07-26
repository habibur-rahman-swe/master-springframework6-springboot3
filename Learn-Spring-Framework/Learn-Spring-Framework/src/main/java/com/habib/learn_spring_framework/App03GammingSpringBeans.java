package com.habib.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.habib.learn_spring_framework.game.GameRunner;

public class App03GammingSpringBeans {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GammingConfiguration.class)) {
			
			context.getBean(GameRunner.class).run();
			
		}
		
	}
}
