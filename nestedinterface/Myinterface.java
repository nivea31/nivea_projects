package com.tnsif.nestedinterface;

public interface Myinterface {
	void calculatearea();
	
	//nested interface
	interface Myinnerinterface{
		
		int id = 70;
		void print();
	}
}
