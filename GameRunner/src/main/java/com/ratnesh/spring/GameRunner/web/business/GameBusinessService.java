package com.ratnesh.spring.GameRunner.web.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ratnesh.spring.GameRunner.web.data.GameDataService;

@Component
public class GameBusinessService {
	
	@Autowired
	private GameDataService gameDataService;
	
	public String getGame(Integer index) {
		return gameDataService.getData(index);
	}

}
