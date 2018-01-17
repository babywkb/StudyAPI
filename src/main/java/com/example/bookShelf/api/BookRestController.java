package com.example.bookShelf.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookShelf.domain.Book;
import com.example.bookShelf.service.BookService;

@RestController
@RequestMapping("api/book")
public class BookRestController {
	@Autowired
	BookService bookService;

	@GetMapping(path = "{id}")
	Book getBook(@PathVariable Integer id) {
		Book book = bookService.findOne(id);
		return book;
	}

}