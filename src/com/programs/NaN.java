package com.programs;

public class NaN {

	public static void main(String[] args) {
//		What is NaN - Not A Number? How is NaN defined in different languages?
		
		// Division of a positive floating-point number by zero results in positive infinity.
        System.out.println(2.0 / 0.0); // Output: Infinity

        // Division of zero by zero results in NaN (Not a Number).
        System.out.println(0.0 / 0.0); // Output: NaN

        // Square root of a negative number results in NaN because it's undefined in real numbers.
        System.out.println(Math.sqrt(-1)); // Output: NaN

        // Comparing NaN with NaN using '==' always returns false because NaN is not equal to anything, even itself.
        System.out.println(Float.NaN == Float.NaN); // Output: false

        // Comparing NaN with NaN using '!=' returns true because NaN is not equal to itself.
        System.out.println(Float.NaN != Float.NaN); // Output: true
		
		

	}

}
