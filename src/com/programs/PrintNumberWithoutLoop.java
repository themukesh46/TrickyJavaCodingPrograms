package com.programs;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {
//Print 1 to 100 Without Using for/while/do-while Loop in Code || Using Recursive
	
	public static void main(String[] args) {
		printNum(1);
		
//		solution 2
		IntStream.range(1, 100).forEach(e -> System.out.println(e));
	} 
//	solution 1 (Recursive)
	public static void printNum(int num) {
		
		if (num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
		
		
	}

}
