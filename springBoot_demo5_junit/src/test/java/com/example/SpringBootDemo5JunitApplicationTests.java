package com.example;

import com.example.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemo5JunitApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    public void test(){
        bookService.save();
        System.out.println("test包下的测试方法");
    }

}
