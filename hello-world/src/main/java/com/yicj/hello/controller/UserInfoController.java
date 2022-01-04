package com.yicj.hello.controller;

import com.yicj.hello.model.UserInfo;
import com.yicj.hello.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("findAll")
    public Iterable<UserInfo> findAll() {
        return userInfoService.findAll();
    }

    @RequestMapping("list")
    public String save() {
        List<UserInfo> list = null;
        userInfoService.save(list);
        return "success";
    }

    @RequestMapping("save")
    public void save(UserInfo bean) {
        userInfoService.save(bean);
    }

    @RequestMapping("findByName")
    public List<UserInfo> findByName(String name) {
        return userInfoService.findByName(name);
    }

    @RequestMapping("findByNameOrDesc")
    public List<UserInfo> findByNameOrDesc(String text) {
        return userInfoService.findByNameOrDesc(text, text);
    }

}