package com.tnsif.exceptionhandling;
//no exception
public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("Welcome");
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
		finally {
			System.out.println("Finally");
		}
	}
}
