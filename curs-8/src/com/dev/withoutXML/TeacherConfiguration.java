package com.dev.withoutXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.dev.withoutXML")
@Import(WisdomWordsService.class)
public class TeacherConfiguration {

    @Autowired
    WisdomWordsService wisdomWordsService;

    @Bean
    public JavaTeacher mySecondJavaTeacher() {
        return new JavaTeacher(wisdomWordsService, 5);
    }

    @Bean
    public JavaTeacher javaTeacher() {
        return new JavaTeacher(wisdomWordsService);
    }

    @Bean
    public MathTeacher mathTeacher() {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.setWisdomService(wisdomWordsService);
        return mathTeacher;
    }
}
