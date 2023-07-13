package com.fis.Strings;

public class XORoperationOnStrings {
	
	public static void main(String agrs[]){
		
		/*Bitwise XOR (exclusive or) "^" is an operator in Java that provides the answer '1' 
		 * if both of the bits in its operands are different, 
		 * if both of the bits are same then the XOR operator gives the result '0'. 
		 * XOR is a binary operator that is evaluated from left to right. 
		 * The operator "^" is undefined for the argument of type String.*/
		
		
		  boolean x = false;
	      boolean y = false;
	      boolean xXorY = x ^ y;
	      System.out.println("false XOR false: "+xXorY);

	      x = false;
	      y = true;
	      xXorY = x ^ y;
	      System.out.println("false XOR true: "+xXorY);

	      x = true;
	      y = false;
	      xXorY = x ^ y;
	      System.out.println("true XOR false: "+xXorY);

	      x = true;
	      y = true;
	      xXorY = x ^ y;
	      System.out.println("true XOR true: "+xXorY);
	      
	      /*false XOR false: false
	      false XOR true: true
	      true XOR false: true
	      true XOR true: false*/

	      String str1 = "1010100101";
	      String str2 = "1110000101";
	      StringBuilder s = new StringBuilder();
	      for(int i=0;i<str1.length();i++){
	    	  s.append(str1.charAt(i)^str2.charAt(i));
	      }
	      System.out.println("Result > "+s);
	      
	        
	      String str3 = "geeksforgeeks";  
	      String str4 = "forgeeksgeeks";  
	      int value = 0;  
	    
	      for (int i = 0; i < str1.length(); i++)  
	      {  
	          value = value ^ (int) str3.charAt(i);  
	          value = value ^ (int) str4.charAt(i);  
	      }  
	      
	      System.out.println(value);
	      
	}

}
