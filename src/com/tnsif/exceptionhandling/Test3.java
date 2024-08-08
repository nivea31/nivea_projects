package com.tnsif.exceptionhandling;
//exception with no matching catch block
public class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Welcome");
		}
	}
}
