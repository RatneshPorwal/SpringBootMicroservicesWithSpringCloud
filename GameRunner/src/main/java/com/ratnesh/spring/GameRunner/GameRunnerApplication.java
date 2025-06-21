package com.ratnesh.spring.GameRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ratnesh.spring.GameRunner.game.GameRunner;
import com.ratnesh.spring.GameRunner.game.MarioGame;
import com.ratnesh.spring.GameRunner.game.SuperContraGame;
import com.ratnesh.spring.GameRunner.web.controller.GameController;
import com.ratnesh.spring.GameRunner.game.Pacman;
import com.ratnesh.spring.GameRunner.game.GameConsole;

@SpringBootApplication
public class GameRunnerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(GameRunnerApplication.class, args);
		
		//MarioGame game=new MarioGame();
		//GameConsole game= new Pacman(); Step 1
		//GameRunner gameRunner=new GameRunner(game); Step 2
		
		GameRunner gameRunner=context.getBean(GameRunner.class);
		gameRunner.run();
		
		GameController gameController=context.getBean(GameController.class);
		System.out.println(gameController.getGame(2));
	}

}
