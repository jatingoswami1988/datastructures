package com.fis.Strings;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		String name = "g  eeks   for ge  eeks  ";
		char ch[] = name.toCharArray();

      /// Method 1		
/*		StringBuilder finalString = new StringBuilder();
		for(int i=0;i<name.length();i++){
			if(ch[i] != ' '){
				finalString.append(ch[i]);
			}
		}

		System.out.println(finalString);
*/
		/// or

		//// Method 2
		
		/*name = name.replaceAll(" ","");
		System.out.println(name);*/
		
		//// Method 3
		
		
		
		

	}

}
