package com.learning.core.day3session2;

import java.util.Map;
import java.util.TreeMap;

class CarDetails implements Comparable<CarDetails> {
    private String name;
    private double price;

    public CarDetails(String name, double price) {
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
        CarDetails other = (CarDetails) obj;
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
    public int compareTo(CarDetails other) {
        return Double.compare(other.price, this.price);
    }
}

public class D03P08_6 {
    public static void main(String[] args) {
        // Create a TreeMap to store car details
        Map<CarDetails, Double> carMap = new TreeMap<>();

        // Add predefined information of 4 car details
        carMap.put(new CarDetails("Bugatti", 80050.0), 80050.0);
        carMap.put(new CarDetails("Swift", 305000.0), 305000.0);
        carMap.put(new CarDetails("Audi", 600100.0), 600100.0);
        carMap.put(new CarDetails("Benz", 900000.0), 900000.0);

        // Retrieve and print the prices of the cars in reverse order
        System.out.println("Output:");
        for (CarDetails car : carMap.keySet()) {
            System.out.println(car.toString());
        }
    }
}