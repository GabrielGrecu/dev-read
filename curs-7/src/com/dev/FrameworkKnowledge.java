package com.dev;

import org.springframework.stereotype.Component;

@Component
public class FrameworkKnowledge implements ITeachingService {
    public String getSomeKnowledge() {
        return "Frameworks are your friend, not your enemy!";
    }

    @Override
    public String teachSomething() {
        return "your enemy!";
    }
}