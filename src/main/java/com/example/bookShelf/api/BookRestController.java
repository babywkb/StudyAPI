package com.example.bookShelf.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		final List<Book> books = bookService.findAll();
		return books;
	}

	@GetMapping(path = "{id}")
	Book getBook(@PathVariable final Integer id) {
		final Book book = bookService.findOne(id);
		return book;
	}

	@PostMapping
	Book postBooks(@RequestBody final Book book) {
		return bookService.create(book);
	}

	@PutMapping(path = "{id}")
	Book putBook(@PathVariable final Integer id, @RequestBody final Book book) {
		book.setId(id);
		return bookService.update(book);
	}

	@DeleteMapping(path = "{id}")
	void deleteBook(@PathVariable final Integer id) {
		bookService.delete(id);
	}
}