package oop;

public class Vehicle {
	
	private String company, colour, fueltype ;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getFueltype() {
		return fueltype;
	}

	@Override
	public String toString() {
		return "Vehicle [company=" + company + ", colour=" + colour + ", fueltype=" + fueltype + "]";
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	
	
}
