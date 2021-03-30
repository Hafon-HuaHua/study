package com.study.base.proxy;

import java.util.function.Function;

public class AnimalFactory {
    private static final Function<String,Animal> ANIMAL = type -> {
        Animal animal = null;
        if ("cat".equals(type)) {
            animal = new Cat();
        }
        if ("dog".equals(type)) {
            animal = new Dog();
        }
        return animal;
    };
//    private static Animal animal = new Animal() {
//        @Override
//        public void run() {
//            System.out.println("animal run");
//        }
//
//        @Override
//        public void jiao() {
//            System.out.println("animal jiao");
//        }
//    };

    public static Function<String,Animal> getInstance(){
        return ANIMAL;
    }
}
