package com.msb.spring01.demo03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/29 9:44
 */
public class SpringTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Request request = (Request) context.getBean("request");
        request.doRequest();
    }
}
