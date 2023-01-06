package com.wisdom_gateway.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdom_gateway.books.model.Book;
import com.wisdom_gateway.books.repository.IBookRepository;


@RestController
@RequestMapping("/books")

public class BookController {
    @Autowired
    private IBookRepository bookRepo;

    @GetMapping("")
    public List<Book> getAllBooks() {
        return this.bookRepo.findAll();
    }

    @GetMapping("/{id}")
    public Book findBookById(@PathVariable long id){
        return this.bookRepo.findById(id).orElse(null);
    }

    @PostMapping("")
    public void saveBook(@RequestBody Book book){
        this.bookRepo.save(book);
    }
}
