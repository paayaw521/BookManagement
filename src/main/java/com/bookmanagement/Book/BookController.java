package com.bookmanagement.Book;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookLibrary bookLibrary;

    public BookController(BookLibrary bookLibrary) {
        this.bookLibrary = bookLibrary;
    }
    @GetMapping("")
    public List<Book> getBooks() {
        return bookLibrary.getBooks();
    }

    @GetMapping("{id}")
    public Book findById(@PathVariable String id) {
        return bookLibrary.findBookById(id);
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        bookLibrary.addBook(book);
    }

    @DeleteMapping("{id}")
    public void deleteBook(@PathVariable String id) {
        Book book = findById(id);
        bookLibrary.removeBook(book);
    }
    @PutMapping("{id}")
    public void updateBook(@RequestBody Book book, @PathVariable String id) {
        bookLibrary.updateBook(book, id);
    }

    @PostConstruct
    public void init() {
        bookLibrary.addBook(new Book("Purple Hibiscus", "Chimamanda Ngozi Adichie", "9780143039990"));
        bookLibrary.addBook(new Book("The Alchemist", "Paulo Coelho", "9780061122415"));
        bookLibrary.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        bookLibrary.addBook(new Book("Things Fall Apart", "Chinua Achebe", "9780385474542"));
        bookLibrary.addBook(new Book("Americanah", "Chimamanda Ngozi Adichie", "9780307745452"));
    }

}
