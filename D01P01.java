package com.learning.core.day1session1;

public class D01P01 {
    
    public static Book createBook(String title, double price) {
        return new Book(title, price);
    }

    // Method to display book details
    public static void showBook(Book book) {
        System.out.println("Book Title: " + book.getTitle() + " and Price: " + book.getPrice());
    }

    public static void main(String[] args) {
        
        Book book = createBook("Java Programming", 350.00);
        showBook(book);
    }
}

	class Book {
	    private String title;
	    private double price;

	    public Book(String title, double price) {
	        this.title = title;
	        this.price = price;
	    }

	    // Getter method for title
	    public String getTitle() {
	        return title;
	    }

	    // Setter method for title
	    public void setTitle(String title) {
	        this.title = title;
	    }

	    // Getter method for price
	    public double getPrice() {
	        return price;
	    }

	    // Setter method for price
	    public void setPrice(double price) {
	        this.price = price;
	    }
	}

