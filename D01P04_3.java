package com.learning.core.day1session1;

public class D01P04_3 {

	 public static int firstRepeatingElement(int[] arr) {
	        // Iterate through the array
	        for (int i = 0; i < arr.length; i++) 
	        {
	            // Check if the current element has occurred before
	            for (int j = i+1 ; j < arr.length; j++) 
	            {
	                if (arr[j] == arr[i]) 
	                {
	                    // If it has, return the repeating element itself
	                    return arr[i];
	                }
	            }
	        }
	        // If no repeating element is found, return -1
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 5, 3, 4, 3, 5, 6};
	        int resultElement = firstRepeatingElement(arr);
	        if (resultElement != -1) 
	        {
	            System.out.println("The first repeating element is: " + resultElement);
	        } 
	        else 
	        {
	            System.out.println("No repeating element found.");
	        }
	    }
	}