package com.example.bookShelf.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bookShelf.domain.Book;
import com.example.bookShelf.repository.BookRepository;

@Service
@Transactional
public class BookService {
	@Autowired
	BookRepository bookRepository;

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findOne(Integer id) {
		return bookRepository.findOne(id);
	}

	public long count() {
		return bookRepository.count();
	}

	public Book create(Book book) {
		return bookRepository.save(book);
	}

	public Book update(Book book) {
		return bookRepository.save(book);
	}

	public void delete(Integer id) {
		bookRepository.delete(id);
	}


}
