package oop;

public class Demoanimal {

	public static void main(String[] args) {
		
		Animal an;
		an = new Animal();
		/*an.set_Value(); 
		an.display();*/
		an.setName("Cat");
		an.setType("wild");
		an.setFoodhabits("nonveg");
		
		System.out.println(an.getName());
		System.out.println(an.getType());
		System.out.println(an.getFoodhabits());
		

	}

}
