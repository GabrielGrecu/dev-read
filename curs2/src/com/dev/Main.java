package com.dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BeanExample beanExample = context.getBean(BeanExample.class);

        System.out.println(beanExample);

        System.out.println();
        beanExample.run(1, "1");
        beanExample.loggableMethod();
    }
}
