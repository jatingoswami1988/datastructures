package com.fis.Strings;

// Java program for above implementation 

public class MoveAllSpaceInFront {
	static final int MAX_CHAR = 26;

	// Method to return string in lexicographic
	// order followed by integers sum
	static String arrangeString(String str) {	
		char char_count[] = new char[MAX_CHAR];
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) //char_count[i] >='A' && char_count[i]<='Z'
				char_count[str.charAt(i) - 'A']++;

			else
				sum = sum + (str.charAt(i) - '0');

		}

		String res = "";
		for (int i = 0; i < MAX_CHAR; i++) {// Loop will run 256 times thats y 26
			char ch = (char) ('A' + i);
			while (char_count[i]-- != 0)
				res = res + ch;
		}

		if (sum > 0)
			res = res + sum;

		return res;
		
	
	}

	// Driver method
	public static void main(String args[]) {
		String str = "ACCBA10D2EW30"; //// AABCCDEW6
		//System.out.println(arrangeString(str));
		System.out.println(arrangeString1(str));
		//arrangeStringUsingMap(str);
	}

	private static String arrangeString1(String str) {
		
		char ch[] = new char[255];
		int sum = 0;
		for(int i=0;i<str.length();i++){

			if(Character.isUpperCase(str.charAt(i))){
				ch[str.charAt(i)]++;
			}else{
				//sum = sum + (int)c[i]-'0';
				sum = sum + (int)(str.charAt(i)-'0');
			}
			
		}
		
		String result = "";
		for(int i=0; i < str.length(); i++){
			char temp = (char)('A'+i);
			while(ch[str.charAt(i)]-- != 0){
				result = result + temp;
			}
			
			
		}
		
		if(sum > 0){
			result = result+sum;
		}
		
		return result;
	}
}
