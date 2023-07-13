package com.fis.javamadesoeasy;

public class LCM {

	public static void main(String[] args) {

		int x = 12;
		int y = 30;

		findLCM(x, y);
		//System.out.println(LCM);

	}

	private static void findLCM(int x, int y) {
		int temp = x > y ? x : y;
		while(true) {
			if(temp%x==0 && temp%y==0) {
				System.out.println(temp);
				break;
			}
			temp++;
		}
		//return LCM;
	}

}
