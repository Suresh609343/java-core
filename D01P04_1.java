package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Accepting two numbers from the user
        System.out.print("Enter two numbers in the range from 1 to 40 separated by space: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        int[] array = {7, 25, 5, 19, 30};

        boolean flag1 = false;
        boolean flag2 = false;
        
        for (int num : array) 
        {
            if (num == number1) 
            {
                flag1 = true;
            }
            if (num == number2) 
            {
                flag2 = true;
            }
        }

        if (flag1 == true && flag2 == true) 
        {
            System.out.println("Its Bingo");
        } 
        else 
        {
            System.out.println("Not Found");
        }

        scanner.close();

	}

}
