package oop;

public class Demovehicle {

	public static void main(String[] args) {
		
		Vehicle v;
		v = new Vehicle();
		v.setCompany("TATA");
		v.setColour("Black");
		v.setFueltype("Diesel");
		
		/*System.out.println(v.getCompany());
		System.out.println(v.getColour());
		System.out.println(v.getFueltype());*/
		
		System.out.println(v); //v.toString()--to print all
	}

}
