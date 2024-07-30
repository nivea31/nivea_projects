package com.tnsif.methodoverloading;

public class Point {
	private float x;
	private float y;
	
	public Point() {
		x=5.6f;
		y=4.5f;
	}
	public Point(float x) {
		this.x=x;
		this.y=y;
		
	}
	public Point (float x, float y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
