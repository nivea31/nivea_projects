package com.tnsif.abstraction;

public class Square extends Shape {
	public float side;
	
	public Square(float side) {
		this.side=side;
	}
	
	@Override
	void calarea() {
		super.area=side*side;
	}
	

}
