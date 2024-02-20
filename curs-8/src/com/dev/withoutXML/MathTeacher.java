package com.dev.withoutXML;

public class MathTeacher implements ITeacher {

    private WisdomWordsService wisdomService;

    private static final String MATH_TEACHER_PREFIX = "Math teacher says: resolve the problem";


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

    public WisdomWordsService getWisdomService() {
        return wisdomService;
    }

}
