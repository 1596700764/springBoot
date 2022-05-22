package com.example.dao.impl;

import com.example.dao.BookDao;
import com.example.domain.Book;
import org.springframework.stereotype.Component;

//@Component
public class BookDaoImpl implements BookDao {

    private BookDao bookDao;
    @Override
    public Book getById(Integer id) {
        return  bookDao.getById(id);
    }
}
