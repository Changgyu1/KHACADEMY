package com.kh.junit.practice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayPracticeTest {
	private ArrayPractice arrp;
	
	/*@Test
	public void testArray1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		arrp = new ArrayPractice(10);
		int[] result = arrp.practice1();
		//int[] actual = arrp.practice1(10);
		assertArrayEquals(expected, result);
	}
	*/
	
	
	@Test
	public void testArray2() {
		String[] arrs = {"월", "화", "수", "목", "금", "토", "일"};
		String expected = arrs[5];
		arrp = new ArrayPractice(5);
		String[] result = arrp.practice2();
		assertArrayEquals(expected,result);
		
	}

	private void assertArrayEquals(String expected, String[] result) {
		// TODO Auto-generated method stub
		
	}
	
	
}
