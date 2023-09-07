package com.app.onlinebookstore.repository;

import com.app.onlinebookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByAuthor(String author);

    List<Book> findAllById(Long id);

    void deleteById(Long id);
}
