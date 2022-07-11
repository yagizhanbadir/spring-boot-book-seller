package com.yb.springbootbookseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "author",nullable = false, length = 100)
    private String author;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "creationTime", nullable = false)
    private LocalDateTime creationTime;



}
