package com.example.spring.controller;

import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ASUS on 2017/6/4.
 */
@RestController
@RequestMapping("/springboot")
public class HelloWorld {

    @Autowired
    private User user;

    @RequestMapping("/")
    public String helloWorld(){
        System.out.println(user);
        return user.toString();
    }
}
