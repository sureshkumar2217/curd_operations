package com.google.da;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

public interface BookService {
    Book create(Book book);
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Book update(Long id, Book book);
    void delete(Long id);
}
