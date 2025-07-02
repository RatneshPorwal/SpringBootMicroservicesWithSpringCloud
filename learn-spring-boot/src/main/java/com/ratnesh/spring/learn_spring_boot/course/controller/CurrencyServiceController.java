package com.ratnesh.spring.learn_spring_boot.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratnesh.spring.learn_spring_boot.CurrencyServiceConfiguration;
import com.ratnesh.spring.learn_spring_boot.course.bean.Course;


@RestController
public class CurrencyServiceController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-service")
	public CurrencyServiceConfiguration currencyService()
	{
		return configuration;
	}

}
