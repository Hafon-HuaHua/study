package com.study.base.pattern.abstractfactory;

public class Bird implements Fly {
    @Override
    public void fly() {
        System.out.println("bird fly");
    }
}
