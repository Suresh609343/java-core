package com.learning.core.day3session1;

import java.util.TreeSet;

class PersonInfo implements Comparable<PersonInfo> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public PersonInfo(int id, String name, int age, double salary) 
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
        return id + " " + name + " " + salary;
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
        PersonInfo other = (PersonInfo) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public int compareTo(PersonInfo person) 
    {
        return this.id - person.id;
    }
}

public class D03P07_6 {
	
    public static void main(String[] args) {
        // Create TreeSet to store persons
        TreeSet<PersonInfo> persons = new TreeSet<>();

        // Add predefined information of 6 persons
        persons.add(new PersonInfo(1, "Jerry", 25, 999.0));
        persons.add(new PersonInfo(2, "Smith", 35, 2999.0));
        persons.add(new PersonInfo(3, "Popeye", 45, 5999.0));
        persons.add(new PersonInfo(4, "Jones", 55, 6999.0));
        persons.add(new PersonInfo(5, "John", 32, 1999.0));
        persons.add(new PersonInfo(6, "Tom", 42, 3999.0));

        // Print id, name, and salary of each person
        System.out.println("Output:");
        for (PersonInfo person : persons)
        {
            System.out.println(person.toString());
        }
    }
}