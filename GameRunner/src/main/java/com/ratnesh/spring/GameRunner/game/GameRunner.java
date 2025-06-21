package com.ratnesh.spring.GameRunner.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	@Autowired
	GameConsole game;
	
	public GameRunner(GameConsole game) {
		this.game=game;
	}

	
	public void run() {
		game.up();
		game.down();
		game.left();
		game.down();

	}

}
