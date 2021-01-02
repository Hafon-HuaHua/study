package com.study.base.pattern.factorymethod;

public class BirdFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Bird();
    }
}
