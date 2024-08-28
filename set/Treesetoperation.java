package com.tnsif.set;
//demo for tree set

import java.util.TreeSet;

public class Treesetoperation {
	public static void treeset() {
		TreeSet<Integer> num=new TreeSet<Integer>();
		
		num.add(23);
		num.add(89);
		num.add(45);
		num.add(null);	//doesnt allow null value
		
		System.out.println("tree set elements are "+ num);
		
	}
	
	public static void main(String[] args) {
		Treesetoperation.treeset();
	}

}
