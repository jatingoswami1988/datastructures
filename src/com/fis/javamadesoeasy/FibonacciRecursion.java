package com.fis.javamadesoeasy;

public class FibonacciRecursion {
	
	   public static int count = 10;
	   public static int i = 0;
	   
	public static void main(String arhs[]){
		
		//int first = 0;
		//int second = 1;
		//fibonacci(first,second);
		
		
		String name = "Jatin";
		System.out.println(name.substring(2));
		
	}

	private static int fibonacci(int first, int second) {
	
		if(i==count)
			return 1;
		
		return fibonacci(first, second); 
		
	}

}
