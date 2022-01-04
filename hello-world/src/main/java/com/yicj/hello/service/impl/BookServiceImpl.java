package com.yicj.hello.service.impl;

import com.yicj.hello.dao.ESBookRepository;
import com.yicj.hello.model.Book;
import com.yicj.hello.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: elasticsearch-study
 * @description:
 * @author: yicj1
 * @create: 2022-01-04 11:36
 **/
@Slf4j
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private ESBookRepository esBookRepository ;
    //@Autowired
    //private TransactionTemplate transactionTemplate ;
    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @Override
    public void addBook(Book book) {
        //Book saveBook = transactionTemplate.execute(status -> esBookRepository.save(book)) ;
        Book saveBook = esBookRepository.save(book) ;
        Book esBook = new Book() ;
        assert saveBook != null ;
        BeanUtils.copyProperties(saveBook, esBook);
        esBook.setId(saveBook.getId() +"");
        try {
            esBookRepository.save(esBook) ;
        }catch (Exception e){
            log.error("保存ES错误!, {}", e.getMessage(), e);
        }
    }

    @Override
    public String save(Book book){
        IndexQuery indexQuery = new IndexQueryBuilder()
                .withId(book.getId().toString())
                .withObject(book)
                .build();
        IndexCoordinates indexCoordinates = IndexCoordinates.of("book");
        return elasticsearchOperations.index(indexQuery,indexCoordinates);
    }

    @Override
    public List<Book> searchBook(String keyword) {
        return esBookRepository.findByTitleOrAuthor(keyword, keyword);
    }

    @Override
    public SearchHits<Book> searchBook1(String keyword) {
        return esBookRepository.find(keyword);
    }
}
