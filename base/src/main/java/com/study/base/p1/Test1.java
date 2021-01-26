package com.study.base.p1;

public class Test1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.str.intern() == b.str);
    }
}
