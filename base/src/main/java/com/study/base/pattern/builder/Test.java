package com.study.base.pattern.builder;

public class Test {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder().buildId(1).buildName("hafon").build();
        System.out.println(p);
    }
}
