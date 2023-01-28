package com.app.rathi;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====================");
		System.out.println("Welcome");
		System.out.println("====================");
		double firstNumber = 0;
		double secondNumber = 0;
		boolean exit = false;
		while (!exit) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter the two number");
			firstNumber = scanner.nextDouble();
			secondNumber = scanner.nextDouble();
			System.out.println("====================");
			System.out.println(" please enter the airthematic operator - +,-,*,/ ");
			System.out.println("====================");
			String operator = scanner.next();
			Calculations calculations = new Calculations(firstNumber, secondNumber);
			switch (operator) {
			case "+":
				System.out.print("Result after adding two numbers = ");
				System.out.println(calculations.addition(firstNumber, secondNumber));
				break;
			case "-":
				System.out.print("Result after substracting two numbers = ");
				System.out.println(calculations.substraction(firstNumber, secondNumber));
				break;
			case "*":
				System.out.print("Result after multiplying two numbers = ");
				System.out.println(calculations.multiplication(firstNumber, secondNumber));
				break;
			case "/":
				System.out.print("Result after dividing two numbers = ");
				System.out.println(calculations.division(firstNumber, secondNumber));
				break;
			default:
				System.out.println("Please enter a correct airthematic operator");
				break;
			}
			System.out.println("Press 1 to use again and 2 to exit");
			int decision = scanner.nextInt();
			if (decision == 2)
				exit = true;
		}

	}
}