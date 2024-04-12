package com.learning.core.day3session1;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getSalary()
    {
        return salary;
    }

    public String toString() 
    {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    public int hashCode() 
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

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

    public int compareTo(Employee employee) 
    {
        return this.id - employee.id;
    }
}

public class D03P07_8 {
	
    public static void main(String[] args) {
        // Create TreeSet to store employees
        TreeSet<Employee> employees = new TreeSet<>();

        // Add predefined information of 6 employees
        employees.add(new Employee(1, "Jerry", 25, 999.0));
        employees.add(new Employee(2, "Smith", 35, 2999.0));
        employees.add(new Employee(3, "Popeye", 45, 5999.0));
        employees.add(new Employee(4, "Jones", 55, 6999.0));
        employees.add(new Employee(5, "John", 32, 1999.0));
        employees.add(new Employee(6, "Tom", 42, 3999.0));

        // Calculate the sum of all salaries
        double sumOfSalaries = 0.0;
        
        for (Employee employee : employees)
        {
            sumOfSalaries += employee.getSalary();
        }

        // Print the sum of all salaries
        System.out.println("Output: " + sumOfSalaries);
    }
}
