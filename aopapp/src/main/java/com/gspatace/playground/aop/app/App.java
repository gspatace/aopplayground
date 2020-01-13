package com.gspatace.playground.aop.app;

import com.gspatace.playground.aop.classes.SomeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SomeService someService = new SomeService(3,"test");
        int result = someService.SquareMeAndAdd(13);
        System.out.println(result);
    }
}
