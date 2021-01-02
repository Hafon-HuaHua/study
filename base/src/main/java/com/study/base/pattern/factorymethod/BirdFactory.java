package com.study.base.pattern.factorymethod;

public class BirdFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Bird();
    }
}
