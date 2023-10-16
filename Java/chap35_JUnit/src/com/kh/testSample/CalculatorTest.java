package com.kh.testSample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddition() {
		Calculator cal = new Calculator();
		int result = cal.add(10, 5);
		assertEquals(15, result); // 예상값과 실제 결과값 비교
	}
	
	@Test
	public void testSubtraction() {
		Calculator cal = new Calculator();
		int result = cal.subtract(20, 5);
		assertEquals(15, result); // 예상값과 실제 결과값 비교
	}

}
