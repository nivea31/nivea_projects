package com.tnsif.collections;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		int size=v.size();
		System.out.println("size of the vector "+size);
		
		v.add("red");
		v.add("white");
		v.add("red");
		v.add("blue");
		System.out.println("size of the vector "+v.size());
		
		int capcity=v.capacity();
		
		System.out.println(capcity);
		
		
	}

}