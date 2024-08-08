package com.tnsif.exceptionhandling;

import java.util.Scanner;
public class Throwndemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rollno.:");
		int rollno = sc.nextInt();
		if(rollno<0) {
			throw new ArithmeticException("rollno cannot be negative");
		}
		else {
			System.out.println("valid rollno.");
		}

	}

}
