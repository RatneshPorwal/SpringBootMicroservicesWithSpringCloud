package com.ratnesh.spring.learn_spring_boot.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratnesh.spring.learn_spring_boot.course.bean.Course;


@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> courses()
	{
		return Arrays.asList(
				new Course(1,"Spring","ranga"),
				new Course(2,"Spring Boot","john"),
				new Course(3,"AWS","steve"),
				new Course(4,"Java","Durga")
				);
	}

}
