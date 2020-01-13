package com.gspatace.playground.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Hello world!
 *
 */
@Aspect
public class SimpleAspect
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
