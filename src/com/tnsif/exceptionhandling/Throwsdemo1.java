package com.tnsif.exceptionhandling;
//demo for throws keyword
import java.io.IOException;
public class Throwsdemo1 {

	public static void display() throws IOException{
		throw new IOException();
	}
	public static void main(String[] args) {
		Throwsdemo1 d=new Throwsdemo1();
		try {
			d.display();
		}
		catch(IOException e) {
			System.out.println("Caught the exception"+e);
		}
	}

}
