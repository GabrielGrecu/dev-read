package com.dev.withContainer;

public class MyFirstSpringApp {
    public static void main(String[] args) {
        MyContainer container = new MyContainer();
        System.out.println(container.getTeacher().getHomework());
    }
}
