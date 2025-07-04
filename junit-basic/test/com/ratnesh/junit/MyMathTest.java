package com.ratnesh.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private List<String> courses= new ArrayList<String>(Arrays.asList("AWS","Spring","Spring Boot"));


	@Test
	void testAssertTrue_courseAvailability() {
		assertTrue(courses.contains("AWS"));
		
	}

	
	@Test
	void testAssertFalse_courseAvailability() {
		assertFalse(courses.contains("GCP"));
		
	}
}
