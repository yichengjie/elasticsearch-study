package com.yicj.hello.util;


import com.yicj.hello.HelloApplication;
import com.yicj.hello.model.Commodity;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.SearchHitsIterator;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class ElasticsearchTemplateTest {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate ;

    @Test
    public void insert(){
        Commodity commodity = new Commodity() ;
        commodity.setSkuId("1501009005");
        commodity.setName("葡萄吐司面包（10片装）");
        commodity.setCategory("101");
        commodity.setPrice(160);
        commodity.setBrand("良品铺子");
        //IndexQuery indexQuery = new IndexQueryBuilder().withObject(commodity).build();
        elasticsearchRestTemplate.save(commodity) ;
    }

    @Test
    public void query(){
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.matchQuery("name", "面包"))
                .build();
        SearchHits<Commodity> hits = elasticsearchRestTemplate.search(searchQuery, Commodity.class);
        hits.forEach(item -> log.info("item : {}", item));
    }

}
