package com.habib.learn_spring_framework;

import com.habib.learn_spring_framework.game.GameRunner;
import com.habib.learn_spring_framework.game.PacManGame;

public class App01GammingBasicJava {
	public static void main(String[] args) {
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
