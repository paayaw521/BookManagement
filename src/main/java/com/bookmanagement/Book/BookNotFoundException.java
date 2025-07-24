package com.bookmanagement.Book;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message) {
        super(message);
    }

    public BookNotFoundException() {
        super("Book not found");
    }
}
