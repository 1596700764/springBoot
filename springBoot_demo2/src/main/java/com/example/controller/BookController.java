package com.example.controller;

import com.example.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@ComponentScan("com.example")
public class BookController {
    @Autowired
    private Environment environment;
    @Value("${server.port}")
    private Integer port;
    @Value("${book.name}")
    private String name;

    @Autowired
    private Book book;


    @GetMapping("/{id}")
    public String getById(Integer id){
        System.out.println(port);
        System.out.println(name);
        System.out.println("------------");
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("book.name"));
        System.out.println(environment.getProperty("book.price"));
        System.out.println(environment.getProperty("book.subject[1]"));
        System.out.println("------------");
        System.out.println(book.getName());
        return "hello";
    }
}
