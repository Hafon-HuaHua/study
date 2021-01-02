package com.study.base.pattern.factorymethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new BirdFactory();
        Animal a = factory.createAnimal();
        a.jiao();
    }
}
