package com.app.rathi;

public class Calculations {

	private double firstNumber;
	private double secondNumber;

	public Calculations(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public double addition() {
		return firstNumber + secondNumber;
	}

	public double substraction() {
		return firstNumber - secondNumber;
	}

	public double multiplication() {
		return firstNumber * secondNumber;
	}

	public double division() {
		return firstNumber / secondNumber;
	}

}
