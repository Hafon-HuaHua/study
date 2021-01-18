package com.study.base.pattern.observer;

public class ObserverChild1 implements Observer {
    @Override
    public void update() {
        System.out.println("observerChild1 update");
    }
}
