package com.ratnesh.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("@***********************************************************************");		

		System.out.println("@BeforeAll");		

	}
	
	
	@BeforeEach
	void beforeEach() {
		System.out.println("@***********************************************************************");

		System.out.println("@BeforeEach");		
	}
	
	
	@Test
	void test1() {
		System.out.println("test1");		
	}

	
	@Test
	void test2() {
		System.out.println("test2");		
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("@@AfterEach");		
		System.out.println("@***********************************************************************");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("@@AfterAll");	
		System.out.println("@***********************************************************************");
	}
}
