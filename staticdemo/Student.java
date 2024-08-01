package com.tnsif.staticdemo;

public class Student {
	int rollno;
	String name;
	static String college="LJ";
	
	static void change() {
		college="NLJ";
	}
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
