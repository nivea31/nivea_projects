package com.tnsif.methodoverloading;
// method overloading
public class Addition {
	
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(Addition.add(6, 10));
		System.out.println(Addition.add(3, 1,7));
	}
}
