package com.msb.spring01.demo02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/29 9:21
 */
public class SpringTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TeacherBean teacherBean = (TeacherBean) context.getBean("studentBean");
        teacherBean.teach();

        StudentBean studentBean = (StudentBean) context.getBean("&studentBean");
        studentBean.study();
    }
}
