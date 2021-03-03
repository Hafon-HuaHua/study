package com.study.base.pattern.observer.ob2;

/**
 * 被观察者接口
 */
public interface ObserverAble {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String str);
}
