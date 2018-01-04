package com.test.dubbo.service;

import com.test.dubbo.pojo.User;

import java.util.List;

/**
 * Created by mayn on 2018/1/4.
 */
public interface UserService {
    /**
     * 查询所有的用户数据
     *
     * @return
     */
     List<User> queryAll();

}
