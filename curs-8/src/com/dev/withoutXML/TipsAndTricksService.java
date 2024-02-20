package com.dev.withoutXML;

import org.springframework.stereotype.Component;

@Component
public class TipsAndTricksService implements ITeachingService{

    public void getTip(){
        System.out.println("Always be thorough and learn from your mistakes!");
    }

    @Override
    public String teachSomething() {
        return "teach something";
    }
}