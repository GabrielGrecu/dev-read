package com.dev.services;

import com.dev.homework.Homework;

public class MathHomeworkService implements HomeworkService {
    private Homework mathHomework;
    private static MathHomeworkService mathHomeworkService;

    private MathHomeworkService(){
        this.mathHomework = new Homework("learn about java", "2024");
    }

    public static MathHomeworkService getMathHomeworkService(){
        if(mathHomeworkService == null){
            synchronized (MathHomeworkService.class){
                if (mathHomeworkService == null){
                    mathHomeworkService = new MathHomeworkService();
                }
            }
        }
        return mathHomeworkService;
    }

    @Override
    public Homework getHomework() {
        return null;
    }
}
