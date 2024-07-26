package com.habib.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.habib.learn_spring_framework.game")
public class GammingAppLauncherApp {
	
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GammingAppLauncherApp.class)) {
			
			context.getBean(GameRunner.class).run();
			
		}
		
	}
}
