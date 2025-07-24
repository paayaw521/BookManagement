package com.bookmanagement.Book;

public class Book {
    private  String title;
    private String author;
    private String ID;

    public Book(String title, String author, String ID) {
        this.title = title;
        this.author = author;
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
}
