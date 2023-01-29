package com.msb.spring01.demo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/29 9:39
 */
@Component
public class Request {

    @Autowired
    private ApplicationContext applicationContext;

    public void doRequest() {
        System.out.println("执行doRequest()方法......");
        applicationContext.publishEvent(new RequestEvent(this));
    }
}
