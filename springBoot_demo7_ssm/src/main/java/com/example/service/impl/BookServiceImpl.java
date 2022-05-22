package com.example.service.impl;


import com.example.controller.Code;
import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.exception.BusinessException;
import com.example.exception.SystemException;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {

        return bookDao.save(book)>0;
    }

    public boolean update(Book book) {

        return bookDao.update(book)>0;
    }

    public boolean delete(Integer id) {

        return bookDao.delete(id)>0;
    }

    public Book getById(Integer id) {

        /*if(id==1){
            throw new BusinessException("请别捣乱", Code.BUSINESS_ERR);
        }
        try {
            int i=1/0;
        } catch (Exception e) {
            throw new SystemException("服务器访问超时",e, Code.SYSTEM_TIMEOUT_ERR);
        }*/

        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
