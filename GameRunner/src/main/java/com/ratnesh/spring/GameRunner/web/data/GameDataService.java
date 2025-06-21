package com.ratnesh.spring.GameRunner.web.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class GameDataService {
	
	public String getData(Integer index)
	{
		List<String> games= new ArrayList<String>();
		games.add("mario");
		games.add("superContra");
		games.add("pacman");
		return games.get(index);
	}

}
