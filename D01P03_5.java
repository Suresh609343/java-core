package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();

	        int factorial = calculateFactorial(number);
	        System.out.println("Factorial of " + number + " is " + factorial);

	        scanner.close();
	    }

	    public static int calculateFactorial(int number) 
	    {
	        if (number == 0 || number == 1) 
	        {
	            return 1;
	        } 
	        else 
	        {
	            int result = 1;
	            
	            for (int i = 2; i <= number; i++) 
	            {
	                result = result * i;
	            }
	            return result;
	        }
	    }
	}
