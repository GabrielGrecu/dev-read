package com.dev;

import org.springframework.stereotype.Component;

@Component
public class MobileKnowledge implements ITeachingService{
    @Override
    public String teachSomething() {
        return "Some mobile knowledge";
    }
}
