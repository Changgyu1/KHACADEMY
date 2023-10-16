package com.kh.testSample.BF;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kh.testSample.Calculator;

public class CalculatorTest {
	private Calculator cal;
	
	@Before
	public void setUp() {
		// �� �׽�Ʈ �޼��� ���� ���� ������ �۾� ����
		cal = new Calculator();
		System.out.println("�׽�Ʈ ����!");
	}
	
	@After
	public void tearDown() {
		// �� �׽�Ʈ �޼��� ���� �� ������ �۾��� ����
		System.out.println("�׽�Ʈ ����!");
	}
	
	@Test
	public void testAddition() {
		int result = cal.add(3, 4);
		assertEquals(7, result);
	}
	
	@Test
	public void testSubraction() {
		int result = cal.subtract(5, 2);
		assertEquals(3,result);
	}
	
	
	
}
