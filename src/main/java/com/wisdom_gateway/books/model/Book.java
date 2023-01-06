package com.wisdom_gateway.books.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "books")
@Getter
@Setter 
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String author;
    private String image;
    private Integer rating;
    private Integer publish_year;

}
