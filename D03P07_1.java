package com.learning.core.day3session1;

import java.util.ArrayList;
import java.util.Scanner;

public class D03P07_1 {
		
		    public static void main(String[] args) {
		        // Create an ArrayList to store student names
		        ArrayList<String> studentList = new ArrayList<>();

		        studentList.add("Jack");
		        studentList.add("Paul");
		        studentList.add("Henry");
		        studentList.add("Mary");
		        studentList.add("Ronaldo");
		        
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the name to search: ");
		        String nameToSearch = scanner.nextLine();

		        // Check if the name exists in the list
		        if (studentList.contains(nameToSearch)) {
		            System.out.println("Output 1: Found");
		        } else {
		            System.out.println("Output 1: Not Found");
		        }
		    }
		}
