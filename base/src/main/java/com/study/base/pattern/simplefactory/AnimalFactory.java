package com.study.base.pattern.simplefactory;

/**
 * 简单工厂/静态工厂
 */
public class AnimalFactory {
    public static Animal createCat(){
        return new Cat();
    }
    public static Animal createDog(){
        return new Dog();
    }
}
