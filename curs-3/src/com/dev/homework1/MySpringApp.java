package com.dev.homework1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context-homework.xml");

        Animal animal = context.getBean("cat", Cat.class);
        System.out.println(animal.makeSound());

        Animal animal2 = context.getBean("dog", Dog.class);
        System.out.println(animal2.makeSound());

        System.out.println(((Cat)animal).getAnimalName());
    }
}
