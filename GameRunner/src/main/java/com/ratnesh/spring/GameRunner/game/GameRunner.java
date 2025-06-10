package com.ratnesh.spring.GameRunner.game;

public class GameRunner {

	MarioGame marioGame;
	public GameRunner(MarioGame marioGame) {
		this.marioGame=marioGame;
	}

	public void run() {
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.down();


		
		
	}

}
