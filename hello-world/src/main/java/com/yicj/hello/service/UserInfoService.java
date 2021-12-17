package com.yicj.hello.service;

import com.yicj.hello.model.UserInfo;

import java.util.List;

public interface UserInfoService {
    Iterable<UserInfo> findAll();

    void save(List<UserInfo> list);

    void save(UserInfo bean);

    List<UserInfo> findByName(String text);

	List<UserInfo> findByNameOrDesc(String name,String desc);
}