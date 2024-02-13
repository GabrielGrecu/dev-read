package com.dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITeacher teacher = context.getBean("javaTeacherXML", ITeacher.class);

        System.out.println(teacher.getWisdom());

        MathTeacher teacher1 = context.getBean("mathTeacher", MathTeacher.class);
        System.out.println(teacher1.getWisdom());
        System.out.println(teacher1.getHomeWork());
        System.out.println(teacher1.getAge());

        JavaTeacher javaTeacher = context.getBean("javaTeacherXML", JavaTeacher.class);
        System.out.println(javaTeacher.getAge());
    }
}