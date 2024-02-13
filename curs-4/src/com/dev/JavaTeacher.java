package com.dev;

public class JavaTeacher implements ITeacher {
    private WisdomWordsService wisdomService;
    private HomeworkService homeworkService;
    private int age;

    // constructor unic care primeste ca parametru un obiect de tipul WisdomWordsService
    public JavaTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

    public JavaTeacher(WisdomWordsService wisdomService, HomeworkService homeworkService) {
        this.wisdomService = wisdomService;
        this.homeworkService = homeworkService;
    }

    @Override
    public String getHomeWork() {
        return "Create 100 classes";
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