package com.example.service;


import com.example.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {

    /**
     * 保存数据
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改数据
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查找数据
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查找所有
     * @return
     */
    public List<Book> getAll();
}
