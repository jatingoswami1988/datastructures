package com.fis.Strings.ReverseAndRotation;

public class ReverseAStringPreservingSpacePositions {

	public static void main(String[] args) {

		String str = "Help others"; /// edc ba
		char ch1[] = str.toCharArray();
		char ch2[] = new char[ch1.length];

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == ' ') {
				ch2[i] = ' ';
			}
		}
		int k = 0;
		for (int j = ch1.length - 1; j >= 0; j--) {
			if (ch1[j] != ' ') {
				if (ch2[k] != ' ') {
					ch2[k] = ch1[j];
					k++;
				}else{
					j++;
					k++;
				}
			}
		}
		System.out.println(new String(ch2));
	}

}
