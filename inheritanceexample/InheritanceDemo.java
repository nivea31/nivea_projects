package com.tnsif.inheritanceexample;

public class InheritanceDemo {
	
}
class Parent
{
	void property()
	{
		System.out.println("Cash,Gold,Plots");
	}
	void marry()
	{
		System.out.println("Aman");
	}
}
class Child extends Parent
{
	void marry()//method overriding
	{
		System.out.println("Sameer");
	}
	
}