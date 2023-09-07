package com.app.onlinebookstore.controller;

import com.app.onlinebookstore.dto.BookDto;
import com.app.onlinebookstore.dto.CreateRequestDto;
import com.app.onlinebookstore.model.Book;
import com.app.onlinebookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/books")
public class BookController {
    private final BookService bookService;

    @GetMapping
    public List<BookDto> getAll() {
        return bookService.findAll();
    }

    @GetMapping(value = "/{id}")
    public BookDto getById(@PathVariable Long id) {
        return bookService.getById(id);
    }

    @PostMapping
    public BookDto createBook(@RequestBody CreateRequestDto bookRequestDto) {
        return bookService.save(bookRequestDto);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        bookService.deleteById(id);
    }

    @GetMapping(value = "/{id}")
    public List<BookDto> findAllById(@PathVariable Long id) {
        return bookService.findAllById(id);
    }

    @GetMapping(value = "/{author}")
    public List<BookDto> findAllByAuthor(@PathVariable String author) {
        return bookService.findAllByAuthor(author);
    }
}
