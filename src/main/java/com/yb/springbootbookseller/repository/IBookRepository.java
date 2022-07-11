package com.yb.springbootbookseller.repository;

import com.yb.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
