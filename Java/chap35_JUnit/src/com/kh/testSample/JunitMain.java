package com.kh.testSample;

import static org.junit.Assert.*;
import org.junit.Test;

public class JunitMain {

	@Test
	public void testStringEqual() {
		String expected = "Hello, World!"; // 예상
		String actual = "Hello, World!";
		assertEquals(expected, actual);
	}

	@Test
	public void testStringInEqual() {
		String expected = "Hello, Java!";
		String actual = "Hello, World!";
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testArrayEqual() {
		int[] expected = {1,2,3};
		int[] actual = {1,2,3};
		assertArrayEquals(expected, actual); // 배열이 같다는 것을 비교
	}
	
	@Test
	public void TestArrayInEqual() {
		int[] expected = {1,2,3};
		int[] actual = {3,2,1};
		assertArrayEquals(expected, actual); // 배열이 다르다는 것을 검증
	}
	
	@Test
	public void testDoubleEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.3;
		assertEquals(expected, actual, 0.001); // 부동소수점 비교(오차범위)
	}
	
	@Test
	public void testDoubleInEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.3;
		assertNotEquals(expected, actual, 0.001); // 부도 소수점이 다르다는 것을 검증
	//	 													(오차점위 지정)
	}
	
	
	
	
	
	
	
}
