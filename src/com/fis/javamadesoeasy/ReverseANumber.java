package com.fis.javamadesoeasy;

public class ReverseANumber {

	public static void main(String args[]) {
		reverseANumber();
		fibonaciSeries();

	}

	private static void fibonaciSeries() {
		////0 1 1 2 3 5 8 13 21 34 55 89.
		
		

	}

	private static void reverseANumber() {
		int number = 12345;
		int rev = 0;

		while (number > 0) {
			int remainder = number % 10;
			number = number / 10;
			rev = rev * 10 + remainder;
		}

		System.out.println("Reverse >" + rev);

	}

}
