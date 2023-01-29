package com.msb.spring01.demo01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/29 9:02
 */
public class SpringTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getFriends().getNames());
    }
}
