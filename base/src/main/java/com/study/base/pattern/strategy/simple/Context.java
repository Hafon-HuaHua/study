package com.study.base.pattern.strategy.simple;

public class Context {
    private IStrategy iStrategy;
    public Context(IStrategy strategy){
        this.iStrategy = strategy;
    }
    public void operate(){
        this.iStrategy.operate();
    }
}
