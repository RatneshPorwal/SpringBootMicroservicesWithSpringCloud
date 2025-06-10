package com.ratnesh.spring.GameRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ratnesh.spring.GameRunner.game.GameRunner;
import com.ratnesh.spring.GameRunner.game.MarioGame;

@SpringBootApplication
public class GameRunnerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GameRunnerApplication.class, args);
		MarioGame marioGame=new MarioGame();
		GameRunner gameRunner=new GameRunner(marioGame);
				gameRunner.run();
	}

}
