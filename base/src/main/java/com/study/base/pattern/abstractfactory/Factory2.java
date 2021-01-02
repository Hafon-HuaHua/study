package com.study.base.pattern.abstractfactory;

public class Factory2 implements AbstractFactory{

    @Override
    public Fly createFly(){
        return new Dayan();
    }

    @Override
    public Land createLand(){
        return new Cat();
    }

    @Override
    public Sea createSea(){
        return new Haitun();
    }
}
