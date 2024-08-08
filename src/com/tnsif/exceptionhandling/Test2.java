package com.tnsif.exceptionhandling;
//exception with matching catch block
public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Caught exception:"+e.getMessage());
		}
		finally {
			System.out.println("Welcome");
		}
	}
}
