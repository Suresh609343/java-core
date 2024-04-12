package com.learning.core.day3session1;

import java.util.HashSet;

class ProductInfo {
    private String productId;
    private String productName;

    public ProductInfo(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfo product = (ProductInfo) obj;
        return productId.equals(product.productId);
    }

    public int hashCode() {
        return productId.hashCode();
    }
}

public class D03P07_3 {
    public static void main(String[] args) {
        // Create HashSet to store products
        HashSet<ProductInfo> products = new HashSet<>();

        // Add predefined information of 4 products
        products.add(new ProductInfo("P001", "Maruti 800"));
        products.add(new ProductInfo("P002", "Maruti Zen"));
        products.add(new ProductInfo("P003", "Maruti Dezire"));
        products.add(new ProductInfo("P004", "Maruti Alto"));

        // Search for a particular product
        String searchProductId = "P003";
        boolean found = false;
        for (ProductInfo product : products) {
            if (product.getProductId().equals(searchProductId)) {
                found = true;
                break;
            }
        }

        // Print search result
        if (found) {
            System.out.println("Output: Product Found");
        } else {
            System.out.println("Output: Product Not Found");
        }
    }
}