// demo for set interface

package com.tnsif.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Setoperation {
	public static void operation() {
		Set<Integer> numset=new HashSet<Integer>();
		
		// add an element
		numset.add(12);
		numset.add(13);
		
		// add a list of number to the set
		numset.addAll(Arrays.asList(new Integer[] {1,4,5,7}));
		
		System.out.println("set elements are "+numset);
		
		Set<Integer> oddset=new HashSet<Integer>();
		
		oddset.addAll(Arrays.asList(new Integer[] {3,7,9,11,13}));
		System.out.println("set elemnts odd "+oddset);
		
		// intersection
		
		Set<Integer> set_intersection=new HashSet<Integer>(numset);
		
		set_intersection.retainAll(oddset);
		
		System.out.println(set_intersection);
	}

}
