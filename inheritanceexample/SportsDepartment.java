package com.tnsif.inheritanceexample;

public class SportsDepartment extends Student {
	
	public String sbranch;
	public int height;
	public float weight;
	
	public SportsDepartment(int sid, String sname, String sbranch, int height, float weight) {
		super(sid, sname);
		this.sbranch = sbranch;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "SportsDepartment [sbranch=" + sbranch + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
