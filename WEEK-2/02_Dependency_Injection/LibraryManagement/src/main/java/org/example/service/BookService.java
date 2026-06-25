package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
    private BookRepository repository;

    public void setBookRepository(BookRepository repository) {
        this.repository = repository;
    }
    public void addBook(){
        System.out.println("BookService.");
        System.out.println("Adding Book...");
        System.out.println("Dependency Injection...");
        repository.save();
    }
}
