package com.example.spring.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by ASUS on 2017/5/24.
 */
public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {
    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        Throwable exception = event.getException();
        exception.printStackTrace();
        System.out.println("ApplicationFailedEvent" + exception.getMessage());
    }
}
