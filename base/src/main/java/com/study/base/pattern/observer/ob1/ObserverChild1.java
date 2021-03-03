package com.study.base.pattern.observer.ob1;

public class ObserverChild1 implements Observer {
    @Override
    public void update() {
        System.out.println("observerChild1 update");
    }
}
