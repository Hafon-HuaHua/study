package com.study.base.p1;

public class StringTest {

    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        String c = "abcdef";
        String d = (a + b).intern();
        String e = "abc";
        System.out.println(c == d);
        System.out.println(a == e);
    }
}
