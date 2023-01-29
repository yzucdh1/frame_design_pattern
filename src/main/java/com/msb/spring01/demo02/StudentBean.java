package com.msb.spring01.demo02;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/29 9:14
 */
@Component("studentBean")
public class StudentBean implements FactoryBean {

    @Override
    public Object getObject() {
        return new TeacherBean();
    }

    @Override
    public Class<?> getObjectType() {
        return StudentBean.class;
    }

    public void study() {
        System.out.println("学生正在学习......");
    }
}
