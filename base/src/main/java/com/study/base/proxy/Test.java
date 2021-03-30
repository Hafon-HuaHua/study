package com.study.base.proxy;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        Animal animal = AnimalFactory.getInstance().apply("dog");
        animal.run();
    }
}
