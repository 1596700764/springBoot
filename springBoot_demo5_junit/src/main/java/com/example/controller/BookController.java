package com.example.controller;

import com.example.service.BookService;
import com.example.service.impl.BookServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;


@ComponentScan("com.example")
@Controller("/")

public class BookController {
    @Autowired
    private BookService book;


}
