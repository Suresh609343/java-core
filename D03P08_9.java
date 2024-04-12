package com.learning.core.day3session2;

import java.util.Hashtable;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation)
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
        return "Employee ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
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
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        return true;
    }
}

public class D03P08_9 {
    public static void main(String[] args) {
        // Create a Hashtable to store employee details with employee id as key
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Add predefined information of 4 employee details
        employeeTable.put(101, new Employee(101, "John Doe", "IT", "Software Engineer"));
        employeeTable.put(102, new Employee(102, "Jane Smith", "HR", "HR Manager"));
        employeeTable.put(103, new Employee(103, "David Johnson", "Finance", "Financial Analyst"));
        employeeTable.put(104, new Employee(104, "Emily Brown", "Marketing", "Marketing Executive"));

        // Verify whether the Hashtable is empty or not
        boolean isEmpty = employeeTable.isEmpty();
        System.out.println(isEmpty);
    }
}