package com.example.LibraryBookManager.controller;

import com.example.LibraryBookManager.model.Book;
import com.example.LibraryBookManager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String getBookList(Model model){
        List<Book> books = bookService.getBookList();
        model.addAttribute("books", books);
        return "book-list";
    }

    @GetMapping("/getbookform")
    public String getBookForm(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "book-form";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Book book = bookService.edit(id);
        model.addAttribute("book", book);
        return "book-form";
    }

    @PostMapping("/submitform")
    public String submitForm(@ModelAttribute Book book){
        bookService.submitForm(book);
        return "redirect:/books/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        bookService.delete(id);
        return "redirect:/books/";
    }
}
