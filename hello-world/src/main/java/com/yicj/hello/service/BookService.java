package com.yicj.hello.service;

import com.yicj.hello.model.Book;
import org.springframework.data.elasticsearch.core.SearchHits;

import java.util.List;

/**
 * @program: elasticsearch-study
 * @description:
 * @author: yicj1
 * @create: 2022-01-04 11:33
 **/
public interface BookService {

    void addBook(Book book) ;

    String save(Book book) ;

    List<Book> searchBook(String keyword) ;

    SearchHits<Book> searchBook1(String keyword) ;
}
