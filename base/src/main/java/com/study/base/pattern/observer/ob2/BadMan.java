package com.study.base.pattern.observer.ob2;

import java.util.ArrayList;
import java.util.List;

public class BadMan implements ObserverAble {
    /**
     * 观察者
     */
    private List<Observer> observerList = new ArrayList();
    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String str) {
        for (Observer observer: observerList) {
            observer.make(str);
        }
    }
    public void run(){
        notifyObserver("罪犯逃跑，开始追击");
    }
    public void play(){
        notifyObserver("罪犯在玩，原地别动");
    }
}
