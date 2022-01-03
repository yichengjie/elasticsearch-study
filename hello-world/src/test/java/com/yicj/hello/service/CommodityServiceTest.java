package com.yicj.hello.service;

import com.yicj.hello.HelloApplication;
import com.yicj.hello.model.Commodity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class CommodityServiceTest {

    @Autowired
    private CommodityService commodityService ;

    @Test
    public void insert(){

        Commodity commodity = new Commodity() ;
        commodity.setSkuId("1501009001");
        commodity.setName("原味切片面包（10片装）");
        commodity.setCategory("1001");
        commodity.setPrice(800);
        commodity.setBrand("良品铺子");
        commodityService.save(commodity) ;
        //
        commodity = new Commodity() ;
        commodity.setSkuId("1501009002");
        commodity.setName("原味切片面包（6片装）");
        commodity.setCategory("101");
        commodity.setPrice(680);
        commodity.setBrand("良品铺子");
        commodityService.save(commodity) ;
        //
        commodity = new Commodity() ;
        commodity.setSkuId("1501009003");
        commodity.setName("元气吐司850g");
        commodity.setCategory("101");
        commodity.setPrice(120);
        commodity.setBrand("百草味");
        commodityService.save(commodity) ;

    }


    @Test
    public void delete(){
        Commodity commodity = new Commodity();
        commodity.setSkuId("元气吐司850g");
        commodityService.delete(commodity);
    }

    @Test
    public void getAll(){
        Iterable<Commodity> iterable = commodityService.getAll();
        iterable.forEach(elem -> log.info("elem: {}", elem));
    }

    @Test
    public void getByName(){
        List<Commodity> list = commodityService.getByName("面包");
        Optional.ofNullable(list).ifPresent(ul -> ul.forEach(li -> log.info("li : {}", li)));
    }

    @Test
    public void page(){
        Page<Commodity> page = commodityService.pageQuery(0, 10, "切片");
        log.info("total page : {}", page.getTotalPages());
        log.info("number : {}", page.getNumber());
        log.info("content : {}", page.getContent());
    }

}
