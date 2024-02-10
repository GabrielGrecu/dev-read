package com.dev.withoutXML;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyFirstSpringApp {
    public static void main(String[] args) {
        TeacherFactory teacherFactory = new TeacherFactory();
        String teacherType = "";
        try(InputStream input = new FileInputStream("src/com/dev/withoutXML/config.properties")){
            Properties prop = new Properties();
            //load a propertie file
            prop.load(input);
            teacherType = prop.getProperty("teacherType");
        } catch (IOException e) {
            e.printStackTrace();
        }

        ITeacher theTeacher = teacherFactory.getTeacher(teacherType);
        System.out.println(theTeacher.getHomework());
    }
}
