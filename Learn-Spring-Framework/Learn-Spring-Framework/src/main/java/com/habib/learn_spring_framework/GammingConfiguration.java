package com.habib.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.habib.learn_spring_framework.game.GameRunner;
import com.habib.learn_spring_framework.game.GammingConsole;
import com.habib.learn_spring_framework.game.PacManGame;

@Configuration
public class GammingConfiguration {

	@Bean
	GammingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	GameRunner gameRunner(GammingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
}
