package com.dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        WebDevTeacher webDevTeacher = context.getBean("webDevTeacher", WebDevTeacher.class);
        webDevTeacher.teach();
        webDevTeacher.getTip();
    }
}
