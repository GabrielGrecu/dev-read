package com.dev;

public class Teacher {
    private String name;
    private School school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void updateSchool(String newName){
        this.school.updateName(newName);
    }

}
