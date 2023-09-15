package com.example.LibraryBookManager.service;

import com.example.LibraryBookManager.model.Book;
import com.example.LibraryBookManager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getBookList() {
        return bookRepository.findAll();
    }

    public Book edit(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void submitForm(Book book) {
        bookRepository.save(book);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
