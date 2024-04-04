package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number between 1 to 7: ");
		        int weekdayNumber = scanner.nextInt();

		        String weekday = getWeekday(weekdayNumber);
		        System.out.println(weekday);

		        scanner.close();
		    }

		    public static String getWeekday(int number) 
		    {
		        if (number == 1) 
		            return "Sunday"; 
		        else if (number == 2) 
		            return "Monday";
		        else if (number == 3) 
		            return "Tuesday";
		        else if (number == 4) 
		            return "Wednesday";
		        else if (number == 5) 
		            return "Thursday";
		        else if (number == 6) 
		            return "Friday";
		        else if (number == 7) 
		            return "Saturday";
		        else 
		            return "Invalid Input";
		    
		    }
	}
