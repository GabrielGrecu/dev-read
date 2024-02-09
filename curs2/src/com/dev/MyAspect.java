package com.dev;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class MyAspect {

    @Pointcut("execution(public * * (..))")
    private void anyPublicOperation(){
        System.out.println("a");
    }

    @Pointcut("execution(* loggable*(..))")
    private void anyLoggableOperation(){
        System.out.println("a");
    }

    @Before(value = "anyPublicOperation() || anyLoggableOperation()", argNames = "joinPoint")
    public void beforeCall(JoinPoint joinPoint){
        System.out.println("Method Name = " + joinPoint.getSignature().toShortString() +
                "|Args =>" + Arrays.asList(joinPoint.getArgs()));
    }
}
