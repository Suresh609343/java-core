package com.learning.core.day3session2;

import java.util.Map;
import java.util.TreeMap;

class CarEntry implements Comparable<CarEntry> {
    private String name;
    private double price;

    public CarEntry(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CarEntry other = (CarEntry) obj;
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
    public int compareTo(CarEntry other) {
        return Double.compare(this.price, other.price);
    }
}

public class D03P08_7 {
    public static void main(String[] args) {
        // Create a TreeMap to store car details
        TreeMap<CarEntry, Double> carMap = new TreeMap<>();

        // Add predefined information of 4 car details
        carMap.put(new CarEntry("Benz", 900000.0), 900000.0);
        carMap.put(new CarEntry("Audi", 600100.0), 600100.0);
        carMap.put(new CarEntry("Bugatti", 80050.0), 80050.0);
        carMap.put(new CarEntry("Swift", 305000.0), 305000.0);

        // Retrieve and print the key-value mapping associated with the greatest price
        Map.Entry<CarEntry, Double> maxEntry = carMap.lastEntry();
        System.out.println(maxEntry.getKey().toString());

        // Retrieve and print the key-value mapping associated with the least price
        Map.Entry<CarEntry, Double> minEntry = carMap.firstEntry();
        System.out.println(minEntry.getKey().toString());
    }
}