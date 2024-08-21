package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Genericdemo {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Nivea");
		al.add("Sidd");
		al.add("Ammit");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
