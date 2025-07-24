package com.bookmanagement.Book;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class BookLibrary {
    List<Book> books = new ArrayList<Book>();


    public List<Book> getBooks() {
        return books;
    }

    public Book findBookById(String id) {
        return books.stream()
                .filter(book -> book.getID().equals(id))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book not found with ID: " + id));
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }

    public void updateBook(Book book, String id) {
        Book existingBook = findBookById(id);
        books.set(books.indexOf(existingBook), book);
    }



}
