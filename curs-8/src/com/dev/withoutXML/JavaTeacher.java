package com.dev.withoutXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mySecondJavaTeacher")
public class JavaTeacher implements ITeacher {
    private WisdomWordsService wisdomService;
    private int age;

    // constructor unic care primeste ca parametru un obiect de tipul WisdomWordsService
    @Autowired
    public JavaTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

    public JavaTeacher(WisdomWordsService wisdomService, int age) {
        this.wisdomService = wisdomService;
        this.age = age;
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}