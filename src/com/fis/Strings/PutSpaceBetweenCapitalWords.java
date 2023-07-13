package com.fis.Strings;

public class PutSpaceBetweenCapitalWords {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder();

		String str = "BruceWayneIsBatman";
		char c[] = str.toCharArray();
		boolean flag = false;
		for (int i = 0; i < c.length; i++) {

			if (c[i] > 65 && c[i] < 90) {
				c[i] += 32;
				flag = true;
			}
			if (i != 0 && flag) {
				s.append(" ");
				
			}
			s.append(c[i]);
			flag = false;
		}

		System.out.println(s);

	}

}
