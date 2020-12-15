package com.study.base.innerclass;

public class InnerTest {

    public static void main(String[] args) {
        Outer.InnerClass innerClass = new Outer().new InnerClass();
        innerClass.show();
        Outer.StaticInnerClass staticInnerClass = new Outer.StaticInnerClass();
        staticInnerClass.show();
    }
}
