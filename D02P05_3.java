package com.learning.core.day2session1;

public class D02P05_3 {

	 public static void main(String[] args) {
	        
		 String input = "abc";
	       
		 System.out.println("Subsequences of " + input + ":");
	     
		 generateSubsequences(input, 0, "");
	    }
	    
	    public static void generateSubsequences(String str, int index, String current) {
	        
	    	if (index == str.length()) 
	    	{
	            if (!current.isEmpty()) 
	            {
	                System.out.print(current + ", ");
	            }
	            return;
	        }
	        
	        // Include current character
	        generateSubsequences(str, index + 1, current + str.charAt(index));
	        
	        // Exclude current character
	        generateSubsequences(str, index + 1, current);
	    }
	}