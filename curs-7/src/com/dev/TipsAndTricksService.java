package com.dev;

import org.springframework.stereotype.Component;

@Component
public class TipsAndTricksService {

    public String getTip(){
        return "Always be thorough and learn from your mistakes!";
    }
}