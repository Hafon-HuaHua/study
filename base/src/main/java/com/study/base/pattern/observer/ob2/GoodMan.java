package com.study.base.pattern.observer.ob2;

public class GoodMan implements Observer{
    @Override
    public void make(String msg) {
        System.out.println(msg);
    }
}
