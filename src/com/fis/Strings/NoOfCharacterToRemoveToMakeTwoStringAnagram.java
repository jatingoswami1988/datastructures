package com.fis.Strings;

public class NoOfCharacterToRemoveToMakeTwoStringAnagram {

	public static void main(String[] args) {

		String str1 = "bcadeh", str2 = "hea"; // abcdeh aeh > 
		System.out.println(anagramCount(str1, str2));
		
		
		//int count = getCount(str1,str2);

	}

	/*private static int getCount(String str1, String str2) {
		int c[] = new int[255];
		for(int i=0;i<str1.length();i++) {
			c[str1.charAt(i)]++;
		}
		return 0;
	}*/

	private static int anagramCount(String str1, String str2) {
		int count = 0;
		int MAX_CHAR = 255;
		char ch[] = new char[MAX_CHAR];
		for (int i = 0; i < str2.length(); i++) {
			ch[str2.charAt(i)]++;
		}
		
		//StringBuilder s = new StringBuilder(str1);
		for(int i=0;i<str1.length();i++){
			if(ch[str1.charAt(i)]==0){
				count++;
				System.out.println(str1.charAt(i));
				//s.deleteCharAt(i);
			}
		}
		//System.out.println(s.toString());
		return count;
	}

}
