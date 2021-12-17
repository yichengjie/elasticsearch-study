package com.yicj.hello.dao;

import com.yicj.hello.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserInfoDao extends CrudRepository<UserInfo, Long> {
    List<UserInfo> findByName(String name);

    List<UserInfo> findByNameOrDesc(String name, String text);
}