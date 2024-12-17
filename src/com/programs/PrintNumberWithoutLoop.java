package com.programs;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		printNum(1);
		
//		solution 2
		IntStream.range(1, 100).forEach(e -> System.out.println(e));
	} 
//	solution 1
	public static void printNum(int num) {
		
		if (num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
		
		
	}

}
