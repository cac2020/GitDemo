package com.spring.learn.service;

import com.spring.learn.dao.UserMapper;
import com.spring.learn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    private String str;

    public User getUserById(String id){
       return  userMapper.selectByPrimaryKey(id);
    }

    private int a;

    private void testcomit(){

    }
}
