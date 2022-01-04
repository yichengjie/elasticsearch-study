package com.yicj.hello.dao;

import com.yicj.hello.model.Book;
import org.springframework.data.elasticsearch.annotations.Highlight;
import org.springframework.data.elasticsearch.annotations.HighlightField;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: elasticsearch-study
 * @description:
 * @author: yicj1
 * @create: 2022-01-04 11:29
 **/
@Repository
public interface ESBookRepository extends ElasticsearchRepository<Book, String> {

    List<Book> findByTitleOrAuthor(String title, String author);

    @Highlight(fields = {
            @HighlightField(name = "title"),
            @HighlightField(name = "author")
    })
    @Query("{\"match\":{\"title\":\"?0\"}}")
    SearchHits<Book> find(String keyword);

    List<Book> findByTitleAndPrice(String title, Integer price);
}
