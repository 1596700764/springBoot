package com.example;

import com.example.dao.BookDao;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemo6MybatisApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    public void get(){
        Book book = bookDao.getById(5);
        System.out.println(book);
    }

}
