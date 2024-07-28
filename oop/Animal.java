package oop;

public class Animal {
	//data members ---- variable name (always private)
	
	private String name, type, foodhabits;
	
	//functions (always public)
	/*public void set_Value()
	{
		name = "Dog";
		type = "domestic";
		foodhabits = "mixed";
	}
	
	public void display() {
		System.out.println(name+" "+type+" "+foodhabits);
	}*/

	
	//functions
	 
	public void setName(String n) {
		this.name = n;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFoodhabits() {
		return foodhabits;
	}

	public void setFoodhabits(String foodhabits) {
		this.foodhabits = foodhabits;
	}

	public String getName() {
		return name;
	}
	
	}
	
