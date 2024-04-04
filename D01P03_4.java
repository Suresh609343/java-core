package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        printNumberTriangle(rows);

        scanner.close();
    }

    public static void printNumberTriangle(int rows) 
    {
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}




