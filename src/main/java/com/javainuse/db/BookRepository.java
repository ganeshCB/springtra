package com.javainuse.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}