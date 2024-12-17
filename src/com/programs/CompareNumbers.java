package com.programs;

//Compare Two Integer Numbers (Integer Caching)
public class CompareNumbers {

	public static void main(String[] args) {
		
		Integer num1= 90;
		Integer num2= 90; 
		
		
//		Integer Caching -> -128 to 127
		if(num1==num2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		} 
		
		
		Integer num3= 190;
		Integer num4= 190; 
		
		if(num3==num4) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
