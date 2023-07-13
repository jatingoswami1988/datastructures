package com.fis.Strings;

public class GenerateRotationOfString {

	public static void main(String[] args) {

		/////////  IMP
		
		
		//// concat the  strings with itself....
		
		String name = "Geeks";
		printRotation(name);
		
	}

	private static void printRotation(String name) {
		int n =name.length();
		StringBuffer s = new StringBuffer(name);
		s.append(name);
		
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(s.charAt(i+j));
			}
			System.out.println();
		}
		
	}

}
