package com.tnsif.stringdemo;

public class Equalsdemo {
	public static void main(String[] args) {
		
		String s1 ="nivea";
		String s2 ="NIVEA";
		String s3 =new String("Rina");
		String s4 ="Shilpa";
		
		//equals
		/*System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));*/
		
		//equalsignorecase
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s4));
	}
}
