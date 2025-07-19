package com.RestProject1.Books.entity;

public class Book {

    private String title;
    private String author;
    private String category;

    // Constructor
    public Book(String title, String author, String category){
        this.title = title;
        this.author = author;
        this.category = category;
    }

    // getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
