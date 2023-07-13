package com.fis.Strings;

public class RotateArrayBy2 {

	public static void main(String[] args) {

		String name = "GeeksforGeeks";
		char c[] = name.toCharArray();

		for (int i = 0; i < 2; i++) {

			char ch = c[0];
			for (int j = 1; j < c.length; j++) {
				c[j - 1] = c[j];
			}
			c[c.length - 1] = ch;

		}

		System.out.println(new String(c));

	}

}
