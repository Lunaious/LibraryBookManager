package com.example.LibraryBookManager.repository;

import com.example.LibraryBookManager.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
