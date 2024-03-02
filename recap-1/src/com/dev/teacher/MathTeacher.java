package com.dev.teacher;

import com.dev.homework.Homework;
import com.dev.services.HomeworkService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MathTeacher {
    private final HomeworkService homeworkService;
    public Homework getHomework(){
        return this.homeworkService.getHomework();
    }
}
