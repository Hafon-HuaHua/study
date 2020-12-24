package com.study.base.pattern.singleton;

public class Singleton_1 {
    private static final Singleton_1 singleton1 = new Singleton_1();
    private Singleton_1(){}

    public static Singleton_1 getInstance(){
        return singleton1;
    }
    public void m(){
        System.out.println("mmmm");
    }

}
