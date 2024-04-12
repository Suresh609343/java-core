package com.learning.core.day3session2;

import java.util.Map;
import java.util.TreeMap;

class Vehicle implements Comparable<Vehicle> {
    private String name;
    private double price;

    public Vehicle(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public double getPrice() 
    {
        return price;
    }

    @Override
    public String toString() 
    {
        return name + " " + price;
    }

    @Override
    public int hashCode() 
    {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Vehicle other) 
    {
        return Double.compare(this.price, other.price);
    }
}

public class D03P08_8 {
    public static void main(String[] args) {
        // Create a TreeMap to store vehicle details
        TreeMap<Vehicle, Double> vehicleMap = new TreeMap<>();

        // Add predefined information of 4 vehicle details
        vehicleMap.put(new Vehicle("Benz", 900000.0), 900000.0);
        vehicleMap.put(new Vehicle("Audi", 600100.0), 600100.0);
        vehicleMap.put(new Vehicle("Bugatti", 80050.0), 80050.0);
        vehicleMap.put(new Vehicle("Swift", 305000.0), 305000.0);

        // Remove and get the key-value mapping associated with the greatest key
        Map.Entry<Vehicle, Double> entry = vehicleMap.pollLastEntry();

        // Print the removed key-value mapping
        System.out.println(entry.getKey().toString());

        // Print the remaining key-value mappings
        for (Map.Entry<Vehicle, Double> vehicleEntry : vehicleMap.entrySet()) 
        {
            System.out.println(vehicleEntry.getKey().toString());
        }
    }
}