package com.study.arithmetic;

public class Unit_1 {
    private static void printNum(int num){
        for(int i = 31;i >= 0;i--){
            System.out.print((num & (1<<i)) == 0 ? 0 : 1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        int num = 5;
//        printNum(num);
//        int a = 2;
//        int b = 3;
//        printNum(a);
//        printNum(b);
//        printNum(a | b);
//        printNum(a & b);
//        printNum(a ^ b);
//        printNum(~a);
        //1 1111111111111111111111111111101
        //最高有效们为1代表负数，0代表正数，然后用最高有效位的下一位开始所有位取反加1
        //就是 负号-后面的值
         printNum(-3);
    }
}
