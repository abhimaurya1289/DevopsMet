package com.comviva.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScientificCalculatorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void ScientificCalculatorAdd() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(2, sc.add(1, 1));
		
	}
	
	@Test
	public void ScientificCalculatorSubstract() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(1,sc.substract(3,2));
		
	}
	
	@Test
	public void ScientificCalculatorMultiply() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(6,sc.multiply(3,2));
		
	}
	
	@Test
	public void ScientificCalculatorDivide() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(1,sc.divide(3,2));
		
	}
	
	

}
