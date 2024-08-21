package com.tnsif.stringdemo;

public class Equaloperator {
	public static void main(String[] args) {
		String s1="nivea";
		String s2="nivea";
		String s3=new String("nivea");
		
		System.out.println(s1==s2);// both refer to same instance
		System.out.println(s1==s3);// s3 refer to instance created in non pool
	}

}
