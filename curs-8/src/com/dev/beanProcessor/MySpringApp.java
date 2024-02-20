package com.dev.beanProcessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        WebDevTeacher webDevTeacher = context.getBean("webDevTeacher", WebDevTeacher.class);

        System.out.println(webDevTeacher.frameworkKnowledge.teachSomething());

        context.close();
    }
}
