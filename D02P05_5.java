package com.learning.core.day2session1;

public class D02P05_5 {
	
	 public static boolean canFormCircle(String[] words) {
	        if (words == null || words.length == 0) return false;

	        // Create a count array to store the difference between inDegree and outDegree of each character
	        int[] count = new int[26]; // Assuming only lowercase alphabets

	        // Calculate the count array
	        for (String word : words) {
	            count[word.charAt(0) - 'a']++;
	            count[word.charAt(word.length() - 1) - 'a']--;
	        }

	        // Check if all counts are zeros
	        for (int i = 0; i < 26; i++) {
	            if (count[i] != 0) return false;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String[] words1 = {"abc", "efg", "cde", "ghi", "ija"};
	        System.out.println(canFormCircle(words1)); // Output: true

	        String[] words2 = {"Ijk", "kji", "abc", "cba"};
	        System.out.println(canFormCircle(words2)); // Output: false
	    }
	}