package com.fis.Strings.string;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Jatina";
		char c[] = name.toCharArray();

		/*for (int i = 0; i < c.length/2; i++) {
			char temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}
		
		System.out.println(new String(c));*/
		
		int count[] = new int[256];
		for (int i = 0; i < name.length(); i++) {
            count[name.charAt(i)]++; 
		}
		
		for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char)(i) +  ", count = " + count[i]);
            }
		}

	}

}
