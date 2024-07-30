package com.tnsif.methodoverriding;

public class OverrideMain {

	public static void main(String[] args) {
		
		HDFC h = new HDFC();
		System.out.println(h.getrateofinterest());
		
		SBI s = new SBI();
		System.out.println(s.getrateofinterest());
	}

}
