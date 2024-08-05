package com.tnsif.multipleinheritance;

public class Warrior implements Character,Weapon {

	@Override
	public void use() {
		System.out.println("use");
		
	}
	@Override
	public void attack() {
		System.out.println("weapon");
	}
	
public static void main(String[] args) {
	Warrior w = new Warrior();
	w.attack();
	w.use();
}
}
