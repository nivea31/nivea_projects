package com.tnsif.stringdemo;

public class Testimmutable {
	public static void main(String[] args) {
		String s="Nivea "; //String literal cannot be modified
		//s.concat("Patel");
		s=s.concat("Patel"); // seperate obj shoukd be created
		System.out.println(s);
	}
}
