package com.example.service;

import com.example.domain.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface BookService{

    public boolean save(Book book);

    public boolean del(Integer id);

    public boolean update(Book book);

    public Book getById(Integer id);

    public List<Book> getAll();
}
