package com.ratnesh.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath myMath=new MyMath();


	@Test
	void testCalculateSum_ThreeNumbers() {
		assertEquals(6, myMath.calculateSum(new int[] {1,2,3}));
		
	}

	
	@Test
	void testCalculateSum_NoNumbers() {
		int result=myMath.calculateSum(new int[] {});
		assertEquals(0, result);
		
	}
}
