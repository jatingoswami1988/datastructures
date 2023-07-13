package com.fis.Strings;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {

	/*
	 * public static void main(String[] args) {
	 * 
	 * String[] str = { "geeks", "for", "geeks", "a", "portal", "to", "learn",
	 * "can", "be", "computer", "science", "zoom", "yup", "fire", "in", "be",
	 * "data", "geeks" };
	 * 
	 * Map<String, Integer> map = new HashMap<>();
	 * 
	 * for (int i = 0; i < str.length; i++) { map.put(str[i],
	 * map.getOrDefault(str[1], 0) + 1); }
	 * 
	 * 
	 * String key = ""; int value = 0; for (Map.Entry<String, Integer> me :
	 * map.entrySet()) { if (me.getValue() > value) { value = me.getValue(); key =
	 * me.getKey(); } }
	 * 
	 * System.out.println(key);
	 * 
	 * TreeMap<Integer, Integer> treeMap = new
	 * TreeMap<>(Collections.reverseOrder()); treeMap.put(45, 45); treeMap.put(3,
	 * 1); treeMap.put(8, 1); treeMap.put(1, 1); treeMap.put(12, 1);
	 * 
	 * System.out.println(treeMap.get(treeMap.firstKey()));
	 * System.out.println(treeMap.firstKey());
	 * 
	 * }
	 */

	public static void main(String args[]) {

		String[] str = { "geeks", "for", "geeks", "a", "portal", "to", "learn", "can", "be", "computer", "science",
				"zoom", "yup", "fire", "in", "be", "data", "geeks" };

		Map<String, Integer> ans = new HashMap<String, Integer>();
		for (int i = 0; i < str.length; i++) {
			ans.put(str[i], ans.getOrDefault(str[i], 0) + 1);
		}

		int key = 0;
		String value = "";
		for (Map.Entry<String, Integer> obj : ans.entrySet()) {
			if (key < obj.getValue()) {
				key = obj.getValue();
				value = obj.getKey();
			}
		}

		System.out.println(value);

	}

}
