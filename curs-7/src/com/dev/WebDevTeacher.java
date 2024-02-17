package com.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("singleton")
@Lazy(value = false)
public class WebDevTeacher {
    @Autowired(required = false)
    private TipsAndTricksService tipsAndTricksService;
//    @Autowired
//    @Qualifier("mobileKnowledge")
    private ITeachingService frameworkKnowledge;

//    @Autowired
//    public WebDevTeacher(ITeachingService iTeachingService) {
//        this.iTeachingService = iTeachingService;
//    }

//    @Autowired(required = false)
//    public WebDevTeacher(TipsAndTricksService tipsAndTricksService, FrameworkKnowledge frameworkKnowledge) {
//        this.tipsAndTricksService = tipsAndTricksService;
//        this.frameworkKnowledge = frameworkKnowledge;
//    }


//    @Autowired(required = false)
//    private void setTipsAndTricksService(TipsAndTricksService tipsAndTricksService) {
//        this.tipsAndTricksService = tipsAndTricksService;
//    }

    public void teach() {
        System.out.println(frameworkKnowledge.teachSomething());
    }

    public void getTip(){
        if(tipsAndTricksService != null){
            System.out.println(tipsAndTricksService.getTip());
        }
    }

    @Autowired
    public void setiTeachingService(ITeachingService frameworkKnowledge) {
        this.frameworkKnowledge = frameworkKnowledge;
        System.out.println("setter");
    }

    @PostConstruct
    public void doInizializationThings(){
        System.out.println("post inizialization");
    }
}