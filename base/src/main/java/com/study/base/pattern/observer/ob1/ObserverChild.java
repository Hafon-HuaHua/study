package com.study.base.pattern.observer.ob1;

public class ObserverChild implements Observer {
    @Override
    public void update() {
        System.out.println("observerChild update");
    }
}
