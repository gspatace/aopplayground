package com.gspatace.playground.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Hello world!
 *
 */

public class SimpleAspect2{}
/*
@Aspect
public class SimpleAspect2
{
    @Pointcut("execution(* com.gspatace.playground.aop.classes.*.*(..))")
    private void genericPointcut(){}


    @Before("genericPointcut()")
    public void beforeGenericPointcut() {
        System.out.println("Before");
    }


    @After("genericPointcut()")
    public void afterGenericPointcut() {
        System.out.println("After");
    }
}
*/