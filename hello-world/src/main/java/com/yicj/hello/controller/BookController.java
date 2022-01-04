package com.yicj.hello.controller;

import com.yicj.hello.model.Book;
import com.yicj.hello.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: elasticsearch-study
 * @description:
 * @author: yicj1
 * @create: 2022-01-04 11:49
 **/
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService ;

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Map<String,String> save(@RequestBody Book book){
        bookService.addBook(book);
        Map<String, String> map = new HashMap<>() ;
        map.put("msg", "ok") ;
        return map ;
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public SearchHits<Book> search(String key){
        return bookService.searchBook1(key) ;
    }
}
