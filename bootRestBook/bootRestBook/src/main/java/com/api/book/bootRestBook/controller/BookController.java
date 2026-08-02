package com.api.book.bootRestBook.controller;

import com.api.book.bootRestBook.controller.entities.Book;
import com.api.book.bootRestBook.controller.entities.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    //get all books  read
    @GetMapping("/book")
    public ResponseEntity<List<Book>> getBook(){

        List<Book> list = bookService.getAllBooks();
        if (list.size()<= 0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
     }

     //get single book by id  read
     @GetMapping("/book/{id}")
     public ResponseEntity<Book> getBook(@PathVariable("id") int id){
        Book book = bookService.getBookById(id);
        if (book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
     }

     //new book create
     @PostMapping("/book")
     public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book book1 = null;
        try {
            book1 = this.bookService.addBook(book);
            System.out.println(book1);
            return ResponseEntity.of(Optional.of(book1));
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
     }

     //delete by id
    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<Void> deleteBook(@PathVariable("bookId") int bookId){
        try {
            this.bookService.deleteBook(bookId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    //update
    @PutMapping("/book/{bookId}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId){
        try {
            this.bookService.updateBook(book, bookId);
            return ResponseEntity.ok().body(book);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
