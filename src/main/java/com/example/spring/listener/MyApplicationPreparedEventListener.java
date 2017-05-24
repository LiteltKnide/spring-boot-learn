package com.example.spring.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * spring boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的。
 * Created by ASUS on 2017/5/24.
 */
public class MyApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        ConfigurableApplicationContext applicationContext = event.getApplicationContext();
        String displayName = applicationContext.getDisplayName();
        System.out.println("ApplicationPreparedEvent  " + displayName);

    }
}
