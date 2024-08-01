package com.tnsif.abstraction;

public abstract class Shape {
	protected float area; // datamember
	
	//abstract method
	abstract void calarea();
	
	//concrete method
	void show() {
		System.out.println("Area Of Shape: "+area);
	}
}
