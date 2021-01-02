package com.study.base.pattern.factorymethod;

public class DogFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
