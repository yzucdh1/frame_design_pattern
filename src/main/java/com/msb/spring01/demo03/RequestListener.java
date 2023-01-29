package com.msb.spring01.demo03;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/29 9:37
 */
@Component
public class RequestListener implements ApplicationListener<RequestEvent> {

    @Override
    public void onApplicationEvent(RequestEvent event) {
        System.out.println("监听到RequestEvent事件,执行代码逻辑......");
    }
}
