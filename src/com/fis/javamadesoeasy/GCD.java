package com.fis.javamadesoeasy;

public class GCD {

	public static void main(String[] args) {

		int x = 12;
		int y = 30;

		int GCD = findLCM(x, y);
		System.out.println(GCD);

	}
 /// Max no which divide the both
	private static int findLCM(int x, int y) {
		int temp = x > y ? y : x;
		int GCD = 1;
		for (int i = 2; i < temp; i++) {
			if (x % i == 0 && y % i == 0) {
				GCD =  i;
			}
		}
		return GCD;
	}

}
