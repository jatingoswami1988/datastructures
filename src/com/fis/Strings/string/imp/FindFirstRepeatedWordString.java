package com.fis.Strings.string.imp;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatedWordString {

	public static void main(String[] args) {

		String name[] = "Ravi had been saying that he had been there".split(" ");
		Map<String, String> result = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			if (result.get(name[i]) != null) {
				System.out.println("Result :" + name[i]);
				break;
			} else {
				result.put(name[i], name[i]);
			}
		}

	}

}
