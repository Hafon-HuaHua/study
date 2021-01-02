package com.study.base.pattern.factorymethod;

public class CatFactory extends AnimalFactory{

    @Override
    Animal createAnimal() {
        return new Cat();
    }
}
