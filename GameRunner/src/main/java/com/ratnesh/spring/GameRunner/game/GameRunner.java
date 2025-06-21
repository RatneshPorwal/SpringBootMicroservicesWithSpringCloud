package com.ratnesh.spring.GameRunner.game;

public class GameRunner {

	MarioGame marioGame;
	SuperContraGame superContraGame;
	public GameRunner(MarioGame marioGame) {
		this.marioGame=marioGame;
	}

	public GameRunner(SuperContraGame superContraGame) {
		this.superContraGame=superContraGame;
	}

	/*
	 * public void run() { marioGame.up(); marioGame.down(); marioGame.left();
	 * marioGame.down();
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	public void run() {
		superContraGame.up();
		superContraGame.down();
		superContraGame.left();
		superContraGame.down();


		
		
	}

}
