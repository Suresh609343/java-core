package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number between 1 to 12: ");
		        int monthNumber = 0;
		        
		        String input = scanner.nextLine();
		        if (input.matches("\\d+")) 
		        {
		            monthNumber = Integer.parseInt(input);
		        } 
		        
		        else 
		        {
		            System.out.println("Invalid Input");
		            return;
		        }

		        String monthName = getMonthName(monthNumber);
		        System.out.println(monthName);

		        scanner.close();
		    }

		    public static String getMonthName(int number) {
		        switch (number) 
		        {
		            case 1:
		                return "January";
		            case 2:
		                return "February";
		            case 3:
		                return "March";
		            case 4:
		                return "April";
		            case 5:
		                return "May";
		            case 6:
		                return "June";
		            case 7:
		                return "July";
		            case 8:
		                return "August";
		            case 9:
		                return "September";
		            case 10:
		                return "October";
		            case 11:
		                return "November";
		            case 12:
		                return "December";
		            default:
		                return "Invalid Input";
		        }
		    }

	}
