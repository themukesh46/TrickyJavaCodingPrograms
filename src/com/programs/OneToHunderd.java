package com.programs;

public class OneToHunderd {

	public static void main(String[] args) {
//		Print from 1 to 100 without using any numbers in your code
		
//		solution 1
		int one = 'a'/'a';
		
		String ten="aaaaaaaaaa";
		
		for (int i=one;i<=(ten.length()*ten.length());i++) {
			
			System.out.println(i);
		}
		
//		using ascii value 
//		ascii value of d is 100
//		solution 2
		for (int i=one;i<='d';i++) {
			System.out.println(i);
		}
		
		
//		solution 3
		String s = "programmin";
		int zero = s.length()-s.length();
		int hundred = s.length() * s.length();
		for(int i = zero; i<=hundred; i++) {
			System.out.println(i);
		}
		
	}

}
