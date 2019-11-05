package com.comviva.calculator;

import java.util.Scanner;

public class ScientificCalculator {
	

	public  int add(int num1,int num2) {
		return num1+num2;
	}
	
	public  int substract(int num1,int num2) {
		return num1-num2;
	}
	
	public  int multiply(int num1,int num2) {
		return  num1*num2;
	}
	public  int divide(int num1,int num2) {
		if(num2==0) {
			throw new IllegalArgumentException("Number cannot be divide by 0!"); 
		}
		return num1/num2;
	}
	

}
