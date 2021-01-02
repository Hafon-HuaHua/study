package com.study.base.pattern.factorymethod;

public class CatFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
