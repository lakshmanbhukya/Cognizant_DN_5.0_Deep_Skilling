package org.example;

import org.example.repository.BookRepository;
import org.example.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookRepository repository=(BookRepository) context.getBean("bookRepository");
        repository.save();
        BookService service=(BookService) context.getBean("bookService");
        service.addBook();
    }
}