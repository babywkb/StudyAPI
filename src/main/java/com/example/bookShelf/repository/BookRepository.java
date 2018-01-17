package com.example.bookShelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookShelf.domain.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
