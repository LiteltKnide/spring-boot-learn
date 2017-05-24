package com.example.spring.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 *
 * Created by ASUS on 2017/5/23.
 */
public class MyApplicationListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationEvent) {

    }
}
