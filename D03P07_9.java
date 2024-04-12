package com.learning.core.day3session1;

import java.util.TreeSet;

class Worker implements Comparable<Worker> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Worker(int id, String name, int age, double salary) 
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
        Worker other = (Worker) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public int compareTo(Worker worker)
    {
        return this.id - worker.id;
    }
}

public class D03P07_9 {
	
    public static void main(String[] args) {
        // Create TreeSet to store workers
        TreeSet<Worker> workers = new TreeSet<>();

        // Add predefined information of 6 workers
        workers.add(new Worker(1, "Jerry", 25, 999.0));
        workers.add(new Worker(2, "Smith", 35, 2999.0));
        workers.add(new Worker(3, "Popeye", 45, 5999.0));
        workers.add(new Worker(4, "Jones", 22, 6999.0));
        workers.add(new Worker(5, "John", 32, 1999.0));
        workers.add(new Worker(6, "Tom", 42, 3999.0));

        // Find and print the first worker whose name starts with 'J'
        System.out.println("Output:");
        
        for (Worker worker : workers)
        {
            if (worker.getName().startsWith("J") && worker.getAge() < 25) 
            {
                System.out.println(worker.toString());
                break;
            }
        }
    }
}