package com.study.base.pattern.factorymethod;

public class DogFactory extends AnimalFactory{

    @Override
    Animal createAnimal() {
        return new Dog();
    }
}
