package com.study.base.pattern.proxy.staticproxy;

public class Tank implements MoveAble{
    @Override
    public void move() {
        System.out.println("tank moving.......");
    }
}
