package com.study.base.pattern.strategy.simple;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new Strategy_1());
        context.operate();
        context = new Context(new Strategy_2());
        context.operate();
        context = new Context(new Strategy_3());
        context.operate();
    }
}
