package com.example.service;

import com.example.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.example")
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void getById(Integer id){
        bookDao.getById(id);

    }
}
