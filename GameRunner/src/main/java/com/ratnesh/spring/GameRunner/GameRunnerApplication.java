package com.ratnesh.spring.GameRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ratnesh.spring.GameRunner.game.GameRunner;
import com.ratnesh.spring.GameRunner.game.MarioGame;
import com.ratnesh.spring.GameRunner.game.SuperContraGame;

@SpringBootApplication
public class GameRunnerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GameRunnerApplication.class, args);
		//MarioGame game=new MarioGame();
		SuperContraGame game= new SuperContraGame();
		GameRunner gameRunner=new GameRunner(game);
				gameRunner.run();
	}

}
