package com.gspatace.playground.aop.classes;

public class SomeService {
    private final int someInt;
    private final String someString;
    public SomeService( int SomeInt, String SomeString) {
        someInt = SomeInt;
        someString = SomeString;
    }

    public SomeService() {
        this(0,"");
    }

    public int SquareMeAndAdd(int ToBeAdded) {
        return someInt * someInt + ToBeAdded;
    }
}
