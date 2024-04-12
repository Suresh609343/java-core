package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_2 {
		
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter the number of last vowels to count: ");
        int n = scanner.nextInt();
        
        String lastNVowels = getLastNVowels(input, n);
        
        if (lastNVowels.equals("")) 
        {
            System.out.println("Mismatch in Vowel Count");
        } 
        else 
        {
            System.out.println("Last " + n + " vowels: " + lastNVowels);
        }
    }
    
    public static String getLastNVowels(String str, int n) {
        
    	String result = "";
        int count = 0;
        
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            char ch = Character.toLowerCase(str.charAt(i));
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                result = ch + result;
                count++;
                
                if (count == n) 
                {
                    break;
                }
            }
        }
        if (count < n) 
        {
            return ""; // Mismatch in vowel count
        }
        return result;
    }
}