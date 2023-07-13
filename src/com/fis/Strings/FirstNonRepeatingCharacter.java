package com.fis.Strings;

import java.util.TreeMap;

public class FirstNonRepeatingCharacter {
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	static void getCharCountArray(String str) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	static int firstNonRepeating(String str) {
		getCharCountArray(str);
		int index = -1, i;
        int k = 3;
        int j = 0;
		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				//if(j==k){
				  break;
				//}
				//j++;				
			}
		}
		return index;
	}

	// Driver method
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		int index = firstNonRepeating(str);

		System.out.println(index == -1 ? "Either all characters are repeating or string " + "is empty"
				: "First non-repeating character is " + str.charAt(index));
		TreeMap<Character, Integer> map = new TreeMap<>();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			map.put(Character.valueOf(ch[i]),
					map.get(Character.valueOf(ch[i])) == null ? 1 : map.get(Character.valueOf(ch[i])) + 1);
		}
		//System.out.println(map.pollFirstEntry().getKey());*/
		
		////// Fill the map first and then loop oever the string again get the value from 
		///// map and check if it is 1 >>> or kth
		
		int k=3;
		int x = 0;
		Character index1 = ' ';
		for(int j=0;j<ch.length;j++){
			if(map.get(Character.valueOf(ch[j]))==1){
				if(x==k){
					index1 = map.pollFirstEntry().getKey(); 
					break;
				}
				x++;
				
			}
		}
		System.out.println(index1);
		
	}
}
