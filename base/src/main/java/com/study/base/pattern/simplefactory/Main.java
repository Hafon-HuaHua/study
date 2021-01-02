package com.study.base.pattern.simplefactory;

public class Main {
    public static void main(String[] args) {
        Animal a = AnimalFactory.createCat();
        Animal a1 = AnimalFactory.createCat();
        System.out.println(a == a1);
        a.jiao();
        a1.jiao();
    }
}
