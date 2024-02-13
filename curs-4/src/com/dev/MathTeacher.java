package com.dev;

public class MathTeacher implements ITeacher {

    private WisdomWordsService wisdomService;
    private int age;

    private static final String MATH_TEACHER_PREFIX = "Math teacher says: resolve the problem";

    @Override
    public String getHomeWork() {
        return "resolve 100 problems";
    }

    @Override
    public String getWisdom() {
        if(wisdomService == null){
            throw new RuntimeException("some message");
        }
        return MATH_TEACHER_PREFIX + wisdomService.getMessage();
    }

    public void setWisdomService(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WisdomWordsService getWisdomService() {
        return wisdomService;
    }

    public int getAge() {
        return age;
    }
}
