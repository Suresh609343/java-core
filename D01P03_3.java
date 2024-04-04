package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the percentage obtained: ");
	        double percentage = scanner.nextDouble();

	        String grade = calculateGrade(percentage);
	        System.out.println(grade);

	        scanner.close();
	    }

	    public static String calculateGrade(double percentage) 
	    {
	        if (percentage >= 60) 
	            return "A Grade";
	        else if (percentage >= 45) 
	            return "B Grade";
	        else if (percentage >= 35) 
	            return "C Grade";
	        else 
	            return "Fail";
	    }
	}
