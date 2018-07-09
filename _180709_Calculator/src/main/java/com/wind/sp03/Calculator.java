package com.wind.sp03;

public class Calculator {
	
	public void addition(int firstNum, int secondNum) {
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
	}
	
	public void subtraction(int firstNum, int secondNum) {
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
	}
	
	public void multiplication(int firstNum, int secondNum) {
		System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
	}
	
	public void division(int firstNum, int secondNum) {
		System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
	}
}
