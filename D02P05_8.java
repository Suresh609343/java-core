package com.learning.core.day2session1;

public class D02P05_8 {
		
		 public static void main(String[] args) {
		        // Input string
		        String input = "Helloworld";

		        // Check if the string can be split into four distinct substrings
		        if (input.length() >= 4 && input.chars().distinct().count() >= 4) {
		            System.out.println("Yes");
		        } else {
		            System.out.println("No");
		        }

	}

}
