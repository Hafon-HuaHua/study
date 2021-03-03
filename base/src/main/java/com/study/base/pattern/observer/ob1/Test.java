package com.study.base.pattern.observer.ob1;

public class Test {
    public static void main(String[] args) {
        Subject subject = new SubjectChild();
        Observer observer = new ObserverChild();
        Observer observer1 = new ObserverChild1();
        subject.addObserver(observer);
        subject.addObserver(observer1);
        subject.doSomething();
    }
}
