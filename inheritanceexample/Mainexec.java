package com.tnsif.inheritanceexample;

public class Mainexec {

	public static void main(String[] args) {
		
		City c = new City();
		c.setName("India");
		c.setStatename("Gujarat");
		c.setCname("Ahmedabad");
		
		System.out.println(c.getName());
		System.out.println(c.getStatename());
		System.out.println(c.getCname());
	}

}
