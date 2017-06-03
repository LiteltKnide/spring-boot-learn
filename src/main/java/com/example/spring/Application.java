package com.example.spring;

import com.example.spring.listener.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ASUS on 2017/5/23.
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/{name}")
    public String test1(@PathVariable("name") String name){
        System.out.println(name);
        return "Hello " + name;
    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.addListeners(new MyApplicationStartingEventListener());
        springApplication.addListeners(new MyApplicationEnvironmentPreparedEventListener());
        springApplication.addListeners(new MyApplicationFailedEventListener());
        springApplication.addListeners(new MyApplicationPreparedEventListener());
        springApplication.addListeners(new MyApplicationReadyEventListener());
        springApplication.run(args);
    }
}
