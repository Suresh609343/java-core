package com.learning.core.day2session1;

public class D02P05_4 {
		
		 public static int minDeletionsToPalindrome(String s) {
		        
			 // Reverse the string to find Longest Common Subsequence
		        
			 	String reverse = new StringBuilder(s).reverse().toString();
		        int n = s.length();
		        int[][] dp = new int[n + 1][n + 1];

		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n; j++) {
		                if (s.charAt(i - 1) == reverse.charAt(j - 1)) {
		                    dp[i][j] = 1 + dp[i - 1][j - 1];
		                } else {
		                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
		                }
		            }
		        }

		        // The minimum number of deletions needed is the difference
		        // between the length of the string and the length of its longest palindromic subsequence
		        return n - dp[n][n];
		    }

		    public static void main(String[] args) {
		        String input = "aebcbda";
		        System.out.println(minDeletionsToPalindrome(input)); // Output: 2
		    }
		}

