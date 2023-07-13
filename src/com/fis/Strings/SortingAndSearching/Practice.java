package com.fis.Strings;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {

		char ch = '1';
		//System.out.println((int)ch);
		
		//int i = 'a';// implicit casting
		//System.out.println(i);
		//System.out.println((int)i);
		//System.out.println((char)i);
		
		/*int array[] = new int[5];
		array[1] = 'f';
		//System.out.println(array[1]);
		
		
		char cArray [] = new char[255];
		cArray[1] = 'e';
		//System.out.println(cArray[1]);
		cArray[2] = 2;
		//System.out.println((int)cArray[2]);
		
		cArray['a'] = 'e';
		System.out.println(cArray['a']);
		
		char chr = '1';
		System.out.println((int)chr);*/
		
		
		char c[] = new char[255];
		c['A'] = '4';
		/*String s = "";
		while(c['A']!=0){
			
			s = s + c['A'];
			c['A']--;
			
		}
		System.out.println(s);*/
		//System.out.println(c['A']);
		
		
		
		
		char ch1 = '1';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		
		String name = "jatina";
		String reverseName = reverseString(name);
		System.out.println(reverseName);
		
		
	}

	private static String reverseString(String name) {
		
		String finalString = "";
		for(int i = name.length()-1 ; i >= 0 ; i--){
			finalString = finalString + name.charAt(i);
		}
		
		return finalString;
	}

}
