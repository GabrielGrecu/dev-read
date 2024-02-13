package com.dev.withContainer;

public class MyContainer {
    private ITeacher teacher;

    public synchronized ITeacher getTeacher(){
        //varianta singleton
        if(teacher == null){
            teacher = new JavaTeacher();
        }
        return teacher;
    }

    //pentru prototype
    public synchronized ITeacher getPrototypeTeacher(){
        return new JavaTeacher();
    }
}
