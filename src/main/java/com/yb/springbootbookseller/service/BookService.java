package com.yb.springbootbookseller.service;

import com.yb.springbootbookseller.model.Book;
import com.yb.springbootbookseller.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookService implements IBookService{

    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Book saveBook(Book book){
        book.setCreationTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }
}
