package com.study.base.pattern.observer.ob1;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new LinkedList<>();

    /**
     * 添加观察者
     * @param observer
     */
    protected void addObserver(Observer observer){
        this.observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    protected void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    /**
     * 通知所有观察者更新状态
     */
    protected void notifyObserver(){
        for(Observer o : observers){
            o.update();
        }
    }

    /**
     * 业务逻辑处理-子类实现
     */
    protected abstract void doSomething();
}
