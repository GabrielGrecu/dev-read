package com.dev.withContainer;

public class MyContainer {
    private ITeacher teacher;

    public ITeacher getTeacher(){
        //varianta singleton
        if(teacher == null){
            teacher = new JavaTeacher();
        }
        return teacher;
    }

    //pentru prototype
    public ITeacher getPrototypeTeacher(){
        return new JavaTeacher();
    }
}
