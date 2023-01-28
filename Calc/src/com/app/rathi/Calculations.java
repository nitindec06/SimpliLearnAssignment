package com.app.rathi;

public class Calculations {

	private double firstNumber;
	private double secondNumber;

	public Calculations(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	public double substraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	public double division(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}

}
