package com.dev.beanProcessor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WebDevTeacher implements DisposableBean {
    ITeachingService frameworkKnowledge;

    @Autowired
    public void setFrameworkKnowledge(ITeachingService frameworkKnowledge) {
        this.frameworkKnowledge = frameworkKnowledge;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method called");
    }
}
