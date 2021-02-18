package com.study.arithmetic;

public class Unit_2 {

    private static int calc(int num){
        int result = 0;
        int n = 1;
        for(int i = 1;i <= num;i++){
            n = n * i;
            result += n;
        }
        return result;
    }
    public static void main(String[] args) {
        //求一个数的阶乘
        System.out.println(calc(3));
        //1 = 1 * 1 = 1
        //2 = 1 + 1 * 2 = 3
        //3 = 3 + 1 * 2 * 3 = 9
        //4 = 9 + 1 * 2 * 3 * 4 = 33
    }
}
