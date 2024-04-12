package com.learning.core.day3session2;

import java.util.Hashtable;

class EmployeeDetails {
    private int id;
    private String name;
    private String department;
    private String designation;

    public EmployeeDetails(int id, String name, String department, String designation) 
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
        EmployeeDetails other = (EmployeeDetails) obj;
        if (id != other.id)
            return false;
        return true;
    }
}

public class D03P08_11 {
    public static void main(String[] args) {
        // Create a Hashtable to store employee details with employee id as key
        Hashtable<Integer, EmployeeDetails> employeeTable = new Hashtable<>();

        // Add predefined information of 4 employee details
        employeeTable.put(1001, new EmployeeDetails(1001, "Daniel", "Analyst", "L&D"));
        employeeTable.put(1002, new EmployeeDetails(1002, "Thomas", "Tester", "Testing"));
        employeeTable.put(1003, new EmployeeDetails(1003, "Robert", "Product Manager", "Development"));
        employeeTable.put(1004, new EmployeeDetails(1004, "Grace", "Tech Support", "HR"));

        // Input employee details to add if not exists
        int id = 1005;
        String name = "Charles";
        String department = "QA Lead";
        String designation = "Testing";

        // Check if the employee id already exists in the Hashtable
        if (!employeeTable.containsKey(id)) {
            // Add the employee if it does not exist
            employeeTable.put(id, new EmployeeDetails(id, name, department, designation));
        }

        // Print all the employees
        for (EmployeeDetails employee : employeeTable.values()) {
            System.out.println(employee);
        }
    }
}