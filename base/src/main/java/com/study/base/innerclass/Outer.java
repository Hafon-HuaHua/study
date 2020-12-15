package com.study.base.innerclass;

public class Outer {

    private String name = "out class";

    public void test(){
        InnerClass innerClass = new InnerClass();
        innerClass.show();
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.show();
    }

    class InnerClass{
        private String name = "inner class";

        public void show(){
            System.out.println("inner class show" + name);
        }
    }
    static class StaticInnerClass{
        private String name = "static class";
        public void show(){
            System.out.println("static inner class show");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }

}
