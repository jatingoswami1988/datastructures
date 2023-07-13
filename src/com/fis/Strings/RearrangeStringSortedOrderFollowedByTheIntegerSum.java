package com.fis.Strings;

import java.util.Map;
import java.util.TreeMap;

public class RearrangeStringSortedOrderFollowedByTheIntegerSum {
	static final int MAX_CHAR = 26;

	static String arrangeString(String str) {
		int char_count[] = new int[MAX_CHAR];
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				char_count[str.charAt(i) - 'A']++;
			} else {
				sum = sum + (str.charAt(i) - '0');
			}
		}
		String res = "";
		for (int i = 0; i < MAX_CHAR; i++) {
			char ch = (char) ('A' + i);
			while (char_count[i]-- != 0)
				res = res + ch;
		}
		if (sum > 0){
			res = res + sum;
		}
		return res;
	}

	// Driver method
	public static void main(String args[]) {
		String str = "ACCBA10D2EW30";
		//System.out.println(arrangeString(str));
		
		System.out.println('A'-'Z');
		System.out.println('a'-'z');
		System.out.println("Acii valie of "+(int)'Z');
		
		char c[] = str.toCharArray();
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			if(c[i] >= 65 && c[i] <= 90){
			 map.put(c[i],1);
			}else{
			  sum = sum+(int)c[i]-'0';	
			}
		}
		
		for(Map.Entry<Character,Integer> result : map.entrySet()){
			
			System.out.print(result.getKey());
			
		}
		System.out.print(sum);
	}
}
