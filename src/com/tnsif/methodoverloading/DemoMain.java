package com.tnsif.methodoverloading;

public class DemoMain {
	public static void main(String[] args) {
		Point p= new Point();
		System.out.println(p);
		
		Point p1= new Point(31.7f);
		System.out.println(p1);
		
		Point p2= new Point(19.6f,15.11f);
		System.out.println(p2);
	}
}
