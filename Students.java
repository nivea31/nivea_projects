package com.tnsif.collections;

public class Students implements Comparable<Student>{
	int rollno;
	String name;
	String branch;
	
	// parameter cons
	public Students(int rollno, String name, String branch) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
	}

	//tostring
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", branch=" + branch + "]";
	}

	@Override
	public int compareTo(Student s) {
		
		return this.name.compareTo(s.name);// student reference next name
	}
	

}
