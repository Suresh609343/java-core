package com.learning.core.day1session1;

import java.util.Arrays;

public class D01P04_4 {
        
	public static void findCombinations(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array to avoid duplicate combinations
        int[] combination = new int[k];
        backtrack(arr, k, 0, combination, 0);
    }

    private static void backtrack(int[] arr, int k, int start, int[] combination, int index) 
    {
        if (index == k) 
        {
            // Check if combination has same numbers aside
            boolean sameAside = false;
            for (int i = 0; i < k - 1; i++) 
            {
                if (combination[i] == combination[i + 1])
                {
                    sameAside = true;
                    break;
                }
            }
            if (!sameAside) 
            {
                // Print the combination
                System.out.print("Combination: ");
                
                for (int i = 0; i < k; i++) 
                {
                    System.out.print(combination[i] + " ");
                }
                System.out.println();
            }
            return;
        }
        for (int i = start; i < arr.length; i++) 
        {
            combination[index] = arr[i];
            backtrack(arr, k, i + 1, combination, index + 1);
            
            while (i < arr.length - 1 && arr[i] == arr[i + 1])
            {
                i++; // Skip duplicates
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 2};
        int k = 2;
        System.out.println("Distinct combinations of size " + k + " are:");
        findCombinations(arr, k);
    }
}