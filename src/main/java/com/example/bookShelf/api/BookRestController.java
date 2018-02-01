package com.example.bookShelf.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookShelf.domain.Book;
import com.example.bookShelf.service.BookService;

@RestController
@RequestMapping("api/books")
public class BookRestController {
	@Autowired
	BookService bookService;

	@GetMapping
	List<Book> getBooks() {
		List<Book> books = bookService.findAll();
		return books;
	}

	@GetMapping(path = "{id}")
	Book getBook(@PathVariable Integer id) {
		Book book = bookService.findOne(id);
		return book;
	}

}