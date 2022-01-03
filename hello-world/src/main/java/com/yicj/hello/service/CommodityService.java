package com.yicj.hello.service;

import com.yicj.hello.model.Commodity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CommodityService{

    long count() ;

    Commodity save(Commodity commodity) ;

    void delete(Commodity commodity) ;

    Iterable<Commodity> getAll() ;

    List<Commodity> getByName(String name) ;

    Page<Commodity> pageQuery(Integer pageNo, Integer pageSize, String kw) ;
}
