package com.yicj.hello.service;

import com.yicj.hello.HelloApplication;
import com.yicj.hello.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: elasticsearch-study
 * @description:
 * @author: yicj1
 * @create: 2021-12-17 17:48
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class UserInfoServiceTest {

    @Autowired
    private UserInfoService userInfoService ;

    @Test
    public void findAll(){
        Iterable<UserInfo> iterable = userInfoService.findAll();
        iterable.forEach(item ->{
            log.info("===> item : {}", item);
        });
    }

    @Test
    public void save(){
        userInfoService.save(new ArrayList<>());
    }

    @Test
    public void findByName(){

    }

    @Test
    public void findByNameOrDesc(){
        List<UserInfo> list = userInfoService.findByNameOrDesc(null, "中华人民共和国国歌");
        log.info("list size : {}", list.size());
        list.forEach(item -> log.info("===> item : {}", item));
    }

}
