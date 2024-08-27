package com.tnsif.collections;
import java.util.Stack;

//stack demo

public class Stackdemo {
	
	public static void main(String[] args) {
		Stack<Integer> ob=new Stack<Integer>();
		ob.push(1);
		ob.push(3);
		ob.push(9);
		ob.push(6);
		ob.push(4);  // to add the data
		System.out.println(ob);
		
		ob.pop();

		ob.pop();  // to remove the data
		System.out.println(ob.peek());// last elemet

		
		System.out.println(ob);
		
		// serach an element
		
		if(ob.isEmpty()) {  // check stack is empty or not
			System.out.println("stack is emplty");
		}
		else {
			System.out.println("stack is not empty");
		}
		
		System.out.println(ob.search(8));// search the data
	}

}
