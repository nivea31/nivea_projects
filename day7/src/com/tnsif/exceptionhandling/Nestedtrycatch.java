package com.tnsif.exceptionhandling;

public class Nestedtrycatch {
	
	public static void check() {
		String str= "NLJ";
		
		int slength=str.length();
		System.out.println("String Lemgth"+slength);
		
		String anostring=null;
		
		int y=6;
		
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("Index out of bound exception"+ex.getMessage());
			}
			System.out.println("String Length"+anostring.length());
		}
		catch(NullPointerException np) {
			System.out.println("Exception is thrown"+np.getMessage());
		}
	}
}
