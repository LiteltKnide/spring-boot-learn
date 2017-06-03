package com.example.spring.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建。
 * Created by ASUS on 2017/5/24.
 */
public class MyApplicationEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent>{
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        SpringApplication springApplication = event.getSpringApplication();
        System.out.println("spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建。");
    }
}
