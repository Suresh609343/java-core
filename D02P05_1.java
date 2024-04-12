package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		       
		// Check if it's a palindrome
		boolean isPalindrome = true;
		
		int length = input.length();
		        
		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - 1 - i)) {
				
				isPalindrome = false;
				break;
				}
			}
		        
		    
		if (isPalindrome)
			System.out.println("It is a Palindrome");
		else
		    System.out.println("It is not a Palindrome.");
		    
	}
}
