package com.yb.springbootbookseller.controller;

import com.yb.springbootbookseller.model.Book;
import com.yb.springbootbookseller.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author sa
 * @date 4.07.2021
 * @time 18:15
 */
@RestController
@RequestMapping("api/book")//pre-path
public class BookController
{
    @Autowired
    private IBookService bookService;

    @PostMapping ("save")//api/book
    public ResponseEntity<?> saveBook(@RequestBody Book book)
    {
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{bookId}") //api/book/{bookId}
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId)
    {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/book
    public ResponseEntity<?> getAllBooks()
    {
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }
}