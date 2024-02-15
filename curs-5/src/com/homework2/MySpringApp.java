package com.homework2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context-homework.xml");

        Task firstTask = context.getBean("task", Task.class);
        Task secondTask = context.getBean("task", Task.class);
        Task thirdTask = context.getBean("task", Task.class);
        firstTask.run();
        secondTask.run();
        thirdTask.run();

        secondTask.destroy();

        context.close();
    }
}
