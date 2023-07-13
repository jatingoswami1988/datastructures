package com.fis.Strings.string.imp;

public class SubstringOfAString {

	public static void main(String[] args) {
		//String str = "abc";
		String str = "forgeeksskeegfor";
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i; j < c.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(c[k]);
				}
				System.out.println("");
			}
		}

		// Using substr method.
		System.out.println("Method two using substring :");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.print(str.substring(i, j) + " ");
			}
			System.out.println("");
		}

		//// Method three
		/*System.out.println("Method three using substring of previous String");
		for (int i = 0; i < str.length(); i++) {
			char[] temp = new char[str.length() - i + 1];
			int tempindex = 0;
			for (int j = i; j < str.length(); j++) {
				temp[tempindex++] = str.charAt(j);
				temp[tempindex] = '\0';
				System.out.println(temp);
			}
		}*/
	}

}
