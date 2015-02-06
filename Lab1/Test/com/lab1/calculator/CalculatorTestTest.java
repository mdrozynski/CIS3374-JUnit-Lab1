package com.lab1.calculator;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2, 2));

		assertTrue(calculator.isEqual(2, 2));
		
	}
	@Test
	public void subtractionTest() {
		assertEquals(2, calculator.subtract(4,2));
		
	}
	@Test
	public void multiplicationTest() {
		assertEquals(12, calculator.multiply(3, 4));
		}
	@Test
	public void divisionTest() {
				assertEquals(4, calculator.divide(8, 2));

	}
	@Test
	public void isEqualTestTrue() {
				assertTrue(calculator.isEqual(2, 2));
		
	}
	@Test
	public void isEqualTestFalse() {
				assertFalse(calculator.isEqual(2, 3));
		
	}

}
