package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
	private int num1;
	private int num2;
	private int result;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
	try {
	
	System.out.println("enter number 1");
			num1=sc.nextInt();
			System.out.println("enter number 2");
			num2=sc.nextInt();
	}catch (InputMismatchException e) {
		System.out.println("invalid input");
	}finally {
		sc.close();
		System.out.println("im Finale");
	}}

	public void calculate() {
		System.out.println("in calculate");
		result = num1 + num2;

	}

	public void display() {
		System.out.println("result b: " + result);

	}
}
