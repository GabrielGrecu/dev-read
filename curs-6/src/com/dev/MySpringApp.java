package com.dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = context.getBean("teacher", Teacher.class);
        teacher.saySomething();

        //needs to be jdk 11: project structure-> project: sdk and language level 11. With 21 doesn't work
    }
}
