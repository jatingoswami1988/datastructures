package com.fis.Strings;

import java.util.HashMap;
import java.util.Map;

public class GroupOccurrencesCharactersAccordingFirstAppearance {

	/*
	 * Input : str = "geeksforgeeks" Output: ggeeeekkssfor Explanation: In the given
	 * string 'g' comes first and occurs 2 times so it is printed first Then 'e'
	 * comes in this string and 4 times so it gets printed. Similarly remaining
	 * string is printed.
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * /////// IMP >>>>
	 * 
	 * String str = "geeksforgeeks"; // >>> ggeeeekkssfor
	 * 
	 * char ch[] = new char[256];
	 * 
	 * for (int i = 0; i < str.length(); i++) { ch[str.charAt(i)]++; }
	 * 
	 * for (int i = 0; i < str.length(); i++) { while (ch[str.charAt(i)] != 0) {
	 * System.out.print(str.charAt(i)); ch[str.charAt(i)]--; }
	 * 
	 * ch[str.charAt(i)] = 0; } }
	 */

	////// MICROSOFT /////////////

	/*
	 * public static void main(String[] args) {
	 * 
	 * /////// IMP >>>>
	 * 
	 * String str = "It is a long day Dear"; // >>> ggeeeekkssfor
	 * 
	 * char ch[] = str.toCharArray();
	 * 
	 * for (int i = 0; i < str.length(); i++) { ch[str.charAt(i)]++; }
	 * 
	 * for (int i = 0; i < str.length(); i++) { //while (ch[str.charAt(i)] != 0) {
	 * System.out.print(str.charAt(i)); //ch[str.charAt(i)]--; //}
	 * 
	 * ch[str.charAt(i)] = 0; }
	 * 
	 * 
	 * Map<Character, Integer> map = new HashMap<>();
	 * 
	 * for (int i = 0; i < ch.length; i++) { if (map.get(Character.valueOf(ch[i]))
	 * != null) { map.put(Character.valueOf(ch[i]),
	 * map.get(Character.valueOf(ch[i])) + 1); } else {
	 * map.put(Character.valueOf(ch[i]), 1);
	 * 
	 * } }
	 * 
	 * }
	 */

	public static void main(String args[]) {

		String str = "geeksforgeeks";

		String result = "";

		int count[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			while(count[str.charAt(i)] > 0) {
				result = result + str.charAt(i);
				count[str.charAt(i)]--;
			}
		}
		
		System.out.println(result);

	}

}
