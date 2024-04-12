package com.learning.core.day3session2;

import java.util.TreeSet;

class BookDetails implements Comparable<BookDetails> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private String publicationDate;

    public BookDetails(int bookId, String title, double price, String author, String publicationDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return bookId + " " + title + "\n" + price + " " + author + "\n" + publicationDate + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + bookId;
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
        BookDetails other = (BookDetails) obj;
        if (bookId != other.bookId)
            return false;
        return true;
    }

    @Override
    public int compareTo(BookDetails other) {
        return this.author.compareTo(other.author);
    }
}

public class D03P08_4 {
    public static void main(String[] args) {
        // Create a TreeSet to store book details
        TreeSet<BookDetails> bookSet = new TreeSet<>();

        // Add predefined information of 5 book details
        bookSet.add(new BookDetails(1003, "Java Programming", 523.0, "Gilad Bracha", "23/11/1984"));
        bookSet.add(new BookDetails(1004, "Read C++", 295.0, "Henry Harvin", "19/11/1984"));
        bookSet.add(new BookDetails(1005, ".Net Platform", 3497.0, "Mark J. Price", "6/3/1984"));
        bookSet.add(new BookDetails(1001, "Python Learning", 715.0, "Martic C. Brown", "2/2/2020"));
        bookSet.add(new BookDetails(1002, "Modern Mainframe", 295.0, "Sharad", "19/5/1997"));

        // Print all the book details sorted by author names
        System.out.println("Output:");
        for (BookDetails book : bookSet) {
            System.out.println(book.toString());
        }
    }
}