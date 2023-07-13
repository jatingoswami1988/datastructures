package com.fis.Strings.string.imp;

public class SubsequenceOfString2 {

	public static void main(String[] args) {
		String str = "cab";
		printSubSeq(str);
	}

	public static void printSubSeqRec(String str, int n, int index, String curr) {
		// base case
		if (index == n) {
			return;
		}
		if (curr != null && !curr.trim().isEmpty()) {
			System.out.print(curr + " ");
		}
		for (int i = index + 1; i < n; i++) {
			curr += str.charAt(i);
			printSubSeqRec(str, n, i, curr);
			curr = curr.substring(0, curr.length() - 1);
		}
	}

	public static void printSubSeq(String str) {
		int index = -1;
		String curr = "";
		printSubSeqRec(str, str.length(), index, curr);
	}
}