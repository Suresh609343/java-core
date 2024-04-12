package com.learning.core.day3session2;

import java.util.HashMap;
import java.util.Map;

class PhoneBookEntry {
    private String name;
    private String phoneNumber;

    public PhoneBookEntry(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() 
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
}

public class D03P08_2 {
    public static void main(String[] args) {
        // Create a HashMap to store phone book details
        Map<String, String> phoneBook = new HashMap<>();

        // Add predefined information of 5 phone book details
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        // Search for the phone number
        String nameToSearch = "Joseph";
        String phoneNumber = phoneBook.get(nameToSearch);

        // Output the phone number
        System.out.println("Output:");
        System.out.println(phoneNumber);
    }
}
