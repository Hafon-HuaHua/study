package com.study.base.pattern.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory f1 = new Factory2();

        Fly fly = f1.createFly();
        fly.fly();
        Land land = f1.createLand();
        land.run();
        Sea sea = f1.createSea();
        sea.swim();
    }
}
