package com.study.base.pattern.abstractfactory;

public class Fish implements Sea {
    @Override
    public void swim() {
        System.out.println("fish swim");
    }
}
