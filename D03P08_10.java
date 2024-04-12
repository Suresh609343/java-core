package com.learning.core.day3session2;

import java.util.Hashtable;

class EmployeeInfo {
    private int id;
    private String name;
    private String department;
    private String designation;

    public EmployeeInfo(int id, String name, String department, String designation) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    // Override toString method
    @Override
    public String toString()
    {
        return id + " " + name + " " + department + " " + designation;
    }

    // Override hashCode method
    @Override
    public int hashCode() 
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmployeeInfo other = (EmployeeInfo) obj;
        if (id != other.id)
            return false;
        return true;
    }
}

public class D03P08_10 {
    public static void main(String[] args) {
        // Create a Hashtable to store employee details with employee id as key
        Hashtable<Integer, EmployeeInfo> employeeTable = new Hashtable<>();

        // Add predefined information of 4 employee details
        employeeTable.put(1001, new EmployeeInfo(1001, "John", "IT", "Software Engineer"));
        employeeTable.put(1002, new EmployeeInfo(1002, "Alice", "HR", "HR Manager"));
        employeeTable.put(1003, new EmployeeInfo(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new EmployeeInfo(1004, "Emily", "Marketing", "Marketing Executive"));

        // Search for a specific employee
        int searchId = 1003;
        EmployeeInfo employee = employeeTable.get(searchId);

        // Print the details of the searched employee
        System.out.println(employee);
    }
}