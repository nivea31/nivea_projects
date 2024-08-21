package com.tnsif.collections;

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("Apple");
		li.add("Mango");
		li.add("Pineapple");
		li.addFirst("Kiwi");
		System.out.println(li);
		
		LinkedList<String> li1 = new LinkedList<String>();
		
		li1.add("Brinjal");
		li1.add("Onion");
		li1.add("Chilly");
		
		li.addAll(li1);  //combine lists
		
		li1.addLast("Bellpepper");
		System.out.println(li1);
	}
}
