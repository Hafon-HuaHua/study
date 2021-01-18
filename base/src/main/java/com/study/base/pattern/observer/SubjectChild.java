package com.study.base.pattern.observer;

public class SubjectChild extends Subject{

    @Override
    protected void doSomething() {
        System.out.println("被观察者状态开始改变");
        //通知所有观察者状态已经改变
        super.notifyObserver();
    }
}
