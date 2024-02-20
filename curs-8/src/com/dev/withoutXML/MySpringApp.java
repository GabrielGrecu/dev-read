package com.dev.withoutXML;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TeacherConfiguration.class, WisdomWordsService.class);

        WebDevTeacher webDevTeacher = context.getBean("webDevTeacher", WebDevTeacher.class);

        System.out.println(webDevTeacher.frameworkKnowledge.teachSomething());

        webDevTeacher.getTip();


        JavaTeacher javaTeacher = context.getBean("javaTeacher", JavaTeacher.class);
        System.out.println(javaTeacher.getWisdom());

        JavaTeacher javaTeacher2 = context.getBean("mySecondJavaTeacher", JavaTeacher.class);
        System.out.println(javaTeacher2.getAge());

        context.close();
    }
}
