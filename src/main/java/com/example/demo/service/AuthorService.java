package com.example.demo.service;

import com.example.demo.model.Author;
import com.example.demo.model.Book;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    void addAuthor(Author author);

    Optional<Author> getAuthor(Integer authorId);

    void updateAuthor(Integer authorId, Author author);

    void deleteAuthor(Integer authorId);

    List<Author> getAllAuthors();

    void addBook(Author author,Book book);


}
