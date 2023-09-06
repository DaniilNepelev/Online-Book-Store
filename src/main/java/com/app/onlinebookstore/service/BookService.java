package com.app.onlinebookstore.service;

import com.app.onlinebookstore.dto.BookDto;
import com.app.onlinebookstore.dto.CreateRequestDto;
import com.app.onlinebookstore.model.Book;

import java.util.List;

public interface BookService {
    BookDto save(CreateRequestDto bookRequestDto);
    List<BookDto> findAll();
    BookDto getById(Long id);
}
