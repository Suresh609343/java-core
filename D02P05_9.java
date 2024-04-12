package com.learning.core.day2session1;

public class D02P05_9 {
		
		public static void main(String[] args) {
	        // Input string
	        String input = "Mr John Smith";

	        // Replace spaces with '%20'
	        String output = replaceSpaces(input);

	        // Output the result
	        System.out.println(output);
	    }

	    // Function to replace spaces with '%20'
	    private static String replaceSpaces(String input) {
	        StringBuilder result = new StringBuilder();
	        for (char c : input.toCharArray()) {
	            if (c == ' ') {
	                result.append("%20");
	            } else {
	                result.append(c);
	            }
	        }
	        return result.toString();
	    }
	}
