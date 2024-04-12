package com.learning.core.day3session1;

import java.util.HashSet;

class ProductItem {
    private String productId;
    private String productName;

    public ProductItem(String productId, String productName)
    {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() 
    {
        return productId;
    }

    public String getProductName() 
    {
        return productName;
    }

    public boolean equals(Object obj) 
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        ProductItem product = (ProductItem) obj;
        return productId.equals(product.productId);
    }

    public int hashCode()
    {
        return productId.hashCode();
    }
}

public class D03P07_4 {
	
    public static void main(String[] args) {
        // Create HashSet to store products
        HashSet<ProductItem> products = new HashSet<>();

        // Add predefined information of 4 products
        products.add(new ProductItem("P001", "Maruti 800"));
        products.add(new ProductItem("P002", "Maruti Zen"));
        products.add(new ProductItem("P003", "Maruti Dezire"));
        products.add(new ProductItem("P004", "Maruti Alto"));

        // Remove a particular product by product ID
        String productIdToRemove = "P002";
        ProductItem productToRemove = null;
        
        for (ProductItem product : products) 
        {
            if (product.getProductId().equals(productIdToRemove))
            {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) 
        {
            products.remove(productToRemove);
        }

        // Print the remaining products
        System.out.println("Output:");
        
        for (ProductItem product : products) {
            System.out.println(product.getProductId() + " " + product.getProductName());
        }
    }
}