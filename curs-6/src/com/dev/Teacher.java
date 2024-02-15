package com.dev;

import org.springframework.stereotype.Component;

@Antet(autor = "Gabriel", data = "15/02/2023", review = {"x","y"})
@MySecondAnnotation("")
@Component()
public class Teacher {
    public void saySomething(){
        System.out.println("do your homework");
    }
}
