package com.study.base.pattern.abstractfactory;

public interface AbstractFactory {

    Fly createFly();

    Land createLand();

    Sea createSea();
}
