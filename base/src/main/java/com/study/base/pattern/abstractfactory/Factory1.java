package com.study.base.pattern.abstractfactory;


public class Factory1 implements AbstractFactory{

    @Override
    public Fly createFly(){
       return new Bird();
    }

    @Override
    public Land createLand(){
        return new Dog();
    }

    @Override
    public Sea createSea(){
        return new Fish();
    }
}
