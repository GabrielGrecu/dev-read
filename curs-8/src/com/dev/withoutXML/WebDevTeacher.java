package com.dev.withoutXML;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WebDevTeacher implements DisposableBean {
    ITeachingService frameworkKnowledge;

    @Autowired
    TipsAndTricksService tipsAndTricksService;

    @Autowired
    public void setFrameworkKnowledge(ITeachingService frameworkKnowledge) {
        this.frameworkKnowledge = frameworkKnowledge;
        System.out.println("setter");
    }

    public void getTip(){
        if(tipsAndTricksService != null){
            tipsAndTricksService.getTip();
        }
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method called");
    }
}
