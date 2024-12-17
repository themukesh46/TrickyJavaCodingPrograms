package com.programs;

public class PrintWithoutSekicolon {

	public static void main(String[] args) {
//		solution 1
		if (System.out.printf("Hello word" + "\n") == null) {
			
		} 
//		solution 2
		if (System.out.append("Hello word" + "\n") == null) {
			
		}
		
//		solution 3
		if (System.out.append("Hello word" + "\n").equals(null)) {
			
		}
	}

}
