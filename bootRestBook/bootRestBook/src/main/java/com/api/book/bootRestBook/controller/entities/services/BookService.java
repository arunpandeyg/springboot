package com.api.book.bootRestBook.controller.entities.services;

import com.api.book.bootRestBook.controller.entities.Book;
import com.api.book.bootRestBook.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {
    @Autowired
    private BookRepository bookRepository;

   // private static List<Book> list = new ArrayList<>();
   // static {
   //     list.add(new Book(12, "Java Complete Reference", "Rudra"));
    //    list.add(new Book(14, "Head First", "Adda"));
   //     list.add(new Book(19, "Think in Java", "Neel"));
   // }
    //get all books

    public List<Book> getAllBooks(){
        List<Book> list = (List<Book>) this.bookRepository.findAll();

        return list;
    }
    //get single book by id
    public  Book getBookById(int id){
        Book book = null;
        try{
           // book = list.stream().filter(e->e.getId()==id).findFirst().get();
            book = this.bookRepository.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }

        return book;
    }
    //adding the book
    public Book addBook(Book book){
        Book result = bookRepository.save(book);

        return result;
    }
    //delete book
    public void deleteBook(int bid){
       //list = list.stream().filter(e -> e.getId() != bid).collect(Collectors.toList());
        bookRepository.deleteById(bid);
    }





    //update
    public void updateBook(Book book, int bookId){
        //list = list.stream().map(b ->{
        //    if (b.getId() == bookId){
         //       b.setTitle(book.getTitle());
         //       b.setAuthor(book.getAuthor());
        //    }return b;
        //}).collect(Collectors.toList());
        book.setId(bookId);
        bookRepository.save(book);
    }
}
