package com.study.base.pattern.observer;

public class ObserverChild implements Observer {
    @Override
    public void update() {
        System.out.println("observerChild update");
    }
}
