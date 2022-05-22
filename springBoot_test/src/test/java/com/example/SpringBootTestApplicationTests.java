package com.example;

import com.example.domain.Book;
import com.example.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private BookService bookService;
    @Test
    void add(){
        bookService.save(new Book(10,"类型","书名","描述"));
        System.out.println("hot-fix");
    }

}
