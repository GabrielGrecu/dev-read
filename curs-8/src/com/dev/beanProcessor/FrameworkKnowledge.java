package com.dev.beanProcessor;

import org.springframework.stereotype.Component;

@Component
public class FrameworkKnowledge implements ITeachingService {
    @Override
    public String teachSomething() {
        return "your enemy!";
    }
}
