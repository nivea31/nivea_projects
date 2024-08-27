package com.tnsif.collections;
import java.util.ArrayList;

public class Democomparables {
	
 public static void main(String[] args) {
//	ArrayList <String> al=new ArrayList<String>();
//	al.add(null);
	 
	 ArrayList<Student> ob=new ArrayList<Student>();
	 
	 Student s=new Student(108,"sushma","cse");
	 ob.add(s);
	  s=new Student(103,"durga","civil");
	  ob.add(s);
	  s=new Student(102,"yuvan","EC");
	 
	 ob.add(s);
	 System.out.println(ob);
	 
}
}


