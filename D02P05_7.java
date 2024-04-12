package com.learning.core.day2session1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D02P05_7 {
		
	public class StringPatternMatcher {
	    public static void main(String[] args) {
	        // Input dictionary
	        String[] dictionary = {"abb", "abc", "xyz", "xyy", "foo"};

	        // Pattern to match
	        Pattern pattern = Pattern.compile("x..y");

	        // Loop through dictionary and find matching strings
	        for (String word : dictionary) {
	            Matcher matcher = pattern.matcher(word);
	            if (matcher.find()) {
	                System.out.print(word + " ");
	            }
	        }
	    }
	    
	}
	
}