package com.tnsif.staticdemo;

public class Employee {
	int eid;
	String name;
	static String company="TNS";
	
	Employee(int r,String n ){
		eid=r;
		name=n;
		
}
	void display() {
		System.out.println(eid+" "+name+" "+company);
	}
}