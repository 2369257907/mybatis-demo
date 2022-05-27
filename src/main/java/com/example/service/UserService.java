package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class UserService {


    @Autowired
    UserMapper userMapper;
    public List<User> Sel(int id){
        Date currentTime = new Date();
        return userMapper.Sel(id,currentTime);
    }



}
