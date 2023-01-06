package com.wisdom_gateway.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdom_gateway.books.model.Book;

public interface IBookRepository extends JpaRepository<Book,Long> {

}
