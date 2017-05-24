package com.example.spring.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by ASUS on 2017/5/23.
 */
public class MyApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {
    private Logger logger = LoggerFactory.getLogger(MyApplicationStartingEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        SpringApplication springApplication = applicationStartingEvent.getSpringApplication();
        springApplication.setHeadless(false);
        System.out.println("启动前111111111111");
        logger.info("1111111111111111111");
    }
}
