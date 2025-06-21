package com.ratnesh.spring.GameRunner.game;

import org.springframework.stereotype.Component;

//@Component
public class SuperContraGame implements GameConsole{
	
	public void up() {
		System.out.println("Super up");
	}
	
	public void down() {
		System.out.println("Super down");
	}

	public void left() {
		System.out.println("Super left");
	}
	
	public void right() {
		System.out.println("Super right");
	}
}
