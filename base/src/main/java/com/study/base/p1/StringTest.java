package com.study.base.p1;

public class StringTest {

    public static void main(String[] args) {
        /*String a = "abc";
        String b = "def";
        String c = "abcdef";
        String d = (a + b).intern();
        String e = "abc";
        System.out.println(c == d);
        System.out.println(a == e);*/
        /*for(int i = 0; i < 100;i++){
            if(i % 2 != 0){
                System.out.print(i + ",");
            }
        }*/
        //10100
        //01010
        //11110 | 11110 >> 2 0111
        //00111 |
        //11111  00001
        System.out.println(30 >> 2);
    }
}
