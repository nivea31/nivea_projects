package com.tnsif.exceptionhandling;

public class WithException {
	public static void main(String[] args) {
		int d=0;
		try 
		{
			int a= 55/0;
			System.out.println("Hello");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught");
		}
	}
}
