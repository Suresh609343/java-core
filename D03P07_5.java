package com.learning.core.day3session1;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) 
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
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public int compareTo(Person person) 
    {
        return this.id - person.id;
    }
}

public class D03P07_5 {
	
    public static void main(String[] args) {
        // Create TreeSet to store persons
        TreeSet<Person> persons = new TreeSet<>();

        // Add predefined information of 6 persons
        persons.add(new Person(1, "Alice", 20, 1500.0));
        persons.add(new Person(2, "Bob", 30, 2500.0));
        persons.add(new Person(3, "Charlie", 35, 3000.0));
        persons.add(new Person(4, "David", 22, 1800.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));

        // Print persons details whose age is greater than 25 and not IDs 2 and 3
        System.out.println("Output:");
        for (Person person : persons)
        {
            if (person.getAge() > 25 && person.getId() != 2 && person.getId() != 3)
            {
                System.out.println(person.toString());
            }
        }
    }
}