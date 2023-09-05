package com.hakim.controller;

import com.hakim.model.Book;
import com.hakim.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAll() {
        return ResponseEntity.ok(bookService.getAll());
    }

    @GetMapping("/save")
    public ResponseEntity<?> save(@RequestParam String name, @RequestParam String writer) {
        bookService.save(new Book(0, name, writer));

        return ResponseEntity.ok(Collections.singletonMap("message", "Book saved with name : " + name));
    }
}
