package com.fis.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortStringAccordingToLength {

	public static void main(String[] args) {
		
		String s = "jatin";
		char c[] =s.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		
		
		String name[] = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop","Neo4j"};
		///Use any sorting 
		
		//TreeMap<Integer,String> result = new TreeMap<Integer,String>();
     //		
	//	for (int i = 0; i < name.length; i++) {
	//		result.put(name[i].length(), name[i]);
	//	}
		
		//O(n2)
		
		
		for(int i=0;i<name.length;i++){			
			for(int j=i+1;j<name.length;j++){				
				if(name[i].length() > name[j].length()){
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}				
			}			
		}
		
		
		System.out.println(Arrays.toString(name));
		
		
		/*Arrays.sort(name,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		for(int i=0;i<name.length;i++){
			System.out.print(name[i] + " ");
		}*/
		
		/*String a = "bbccdefbbaa";
		char[] c = a.toCharArray();
		Arrays.sort(c);
		System.out.println(new String(c));*/
		
		/// Use natural sorting
		
		//Arrays.sort(name);
		//System.out.println(Arrays.toString(name));
		
		Arrays.sort(name,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			
				return o1.compareTo(o2);
			}
		
		});
		
		/*for(int i=0;i<name.length;i++){
			System.out.print(name[i] + " ");
		}*/
		
		//System.out.println(Arrays.toString(name));
		
		

	}

}
