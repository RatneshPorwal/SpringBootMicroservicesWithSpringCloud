package com.ratnesh.spring.GameRunner.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ratnesh.spring.GameRunner.web.business.GameBusinessService;

@Component
public class GameController {
	
	@Autowired
	private GameBusinessService gameBusinessService;
	
	public String getGame(Integer index) {
		return gameBusinessService.getGame(index);
	}

}
