package com.hakim.service;

import com.hakim.model.Book;
import com.hakim.repository.BookRepo;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepo repo;

    @PostConstruct
    public void intiBook(){
        repo.saveAll(Stream.of(new Book(0,"Java Programming","A N M")
                        ,new Book(0,"Java Thread Programming","A N M"))
                .collect(Collectors.toList()));
    }
    public void save(Book book){
        repo.save(book);
    }

    public List<Book> getAll(){
        return repo.findAll();
    }
}
