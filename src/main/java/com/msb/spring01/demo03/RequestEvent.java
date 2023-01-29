package com.msb.spring01.demo03;

import org.springframework.context.ApplicationEvent;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/29 9:36
 */
public class RequestEvent extends ApplicationEvent {

    public RequestEvent(Object source) {
        super(source);
    }
}
