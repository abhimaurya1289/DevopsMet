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
	public void ScientificCalculatorAdd1() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(0, sc.add(-1, 1));
		
	}
	
	@Test
	public void ScientificCalculatorAdd2() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(-2, sc.add(-1, -1));
		
	}
	
	@Test
	public void ScientificCalculatorAdd3() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(0, sc.add(1, -1));
		
	}
	
	@Test
	public void ScientificCalculatorSubstract() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(1,sc.substract(3,2));
		
	}
	
	@Test
	public void ScientificCalculatorSubstract1() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(5,sc.substract(3,-2));
		
	}
	
	@Test
	public void ScientificCalculatorSubstract2() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(-5,sc.substract(-3,2));
		
	}
	
	@Test
	public void ScientificCalculatorSubstract3() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(-1,sc.substract(-3,-2));
		
	}
	
	
	
	@Test
	public void ScientificCalculatorMultiply() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(6,sc.multiply(3,2));
		
	}
	
	@Test
	public void ScientificCalculatorMultiply1() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(-6,sc.multiply(3,-2));
		
	}
	
	@Test
	public void ScientificCalculatorMultiply2() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(-6,sc.multiply(-3,2));
		
	}
	
	@Test
	public void ScientificCalculatorMultiply3() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(6,sc.multiply(-3,-2));
		
	}
	
	@Test
	public void ScientificCalculatorDivide() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(1,sc.divide(3,2));
		
	}
	
	@Test
	public void ScientificCalculatorDivide1() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(-1,sc.divide(-3,2));
		
	}
	
	@Test
	public void ScientificCalculatorDivide2() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(-1,sc.divide(3,-2));
		
	}
	
	@Test
	public void ScientificCalculatorDivide3() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(1,sc.divide(-3,-2));
		
	}
	
	@Test
	public void ScientificCalculatorDivide4() {
		
		ScientificCalculator sc=new ScientificCalculator();
		assertEquals(2147483647,sc.divide(-3,0));
		
	}
	
	

}
