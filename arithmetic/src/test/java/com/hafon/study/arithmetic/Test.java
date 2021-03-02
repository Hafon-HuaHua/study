package com.hafon.study.arithmetic;

public class Test {
    private static void show(){
        String str = "cat";
        System.out.println(str);
       chageStr(str);
        System.out.println(str);
    }

    private static void chageStr(String str) {
        str = "tom";
    }

    public static void main(String[] args) {
//        Hafon1 h1 = new Hafon1();
        show();
        String s1 = "hello";
        String s2 = "hello";
        s1 = "world";
        System.out.println(s1);
        System.out.println(s2);
    }
}
