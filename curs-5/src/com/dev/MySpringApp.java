package com.dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(School.counter);

        School firstSchool = context.getBean("school", School.class);

        School secondSchool = context.getBean("school", School.class);
        System.out.println(firstSchool == secondSchool);
        System.out.println(School.counter);

        Teacher firstTeacher = context.getBean("teacher", Teacher.class);
        Teacher secondTeacher = context.getBean("teacher", Teacher.class);

        System.out.println(firstTeacher == secondTeacher);

        firstTeacher.updateSchool("Medicina");

        System.out.println(firstTeacher.getSchool().getName());
        System.out.println(secondTeacher.getSchool().getName());


        firstSchool.getAddress().setStreetName("Bd unirii");

        System.out.println(firstSchool.getAddress().getStreetName());
        System.out.println(secondSchool.getAddress().getStreetName());

        context.close();
    }
}
