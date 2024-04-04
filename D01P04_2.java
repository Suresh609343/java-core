package com.learning.core.day1session1;

public class D01P04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

	        // Compute the sum of elements from index 0 to 14 and store it at element 15
		 
	        int sum = 0;
	        for (int i = 0; i < 15; i++) 
	        {
	            sum = sum + A[i];
	        }
	        
	        A[15] = sum;

	        // Compute the average of all numbers and store it at element 16
	        
	        double average = sum / 15.0;
	        A[16] = (int) Math.round(average);

	        // Identify the smallest value from the array and store it at element 17
	        int smallest = A[0];
	        for (int i = 1; i < 15; i++) 
	        {
	            smallest = Math.min(smallest, A[i]);
	        }
	        A[17] = smallest;

	        // Output the results
	        for (int i = 15; i < 18; i++) 
	        {
	            System.out.print(A[i] + " ");
	        }

	}

}
