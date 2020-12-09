package com.study.base.p1;

import java.util.Scanner;

public class Base_0 {
    public static void sum(){
        double s1 = 0;
        double s2 = 0;
        for(int i = 0;i < 10;i++){
            if(i % 2 == 0){
                //偶数
                s1 += i;
            }else{
                //奇数
                s2 += i;
            }
        }
        System.out.println("100内所有偶数的和为：" + s1 +"，所有奇数的和为：" + s2);
    }
    public static void sum1(){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i < 100;i++){
            if(i % 5 == 0){
                sb.append(i + ",");
                if(sb.toString().split(",").length % 3 == 0){
                    System.out.println(sb.toString().substring(0,sb.length() - 1));
                    sb.delete(0,sb.length());
                }
            }else{
                continue;
            }
        }
    }

    public static void main(String[] args) {
        //4的正数原码：0000 0100，非运算就是取反操作变成负数：1000 0100 = -4 再取反码，最高位不变后面第一位取反:1111 1011 最终结果。由于计算机
        //操作是补码，所以需要先 - 1 变 成反码，即得：1111 1010，但最终要得到原码，所以在反码的基础上再取反就是原码，最高位为1表示负数，为0表示正数，即：1000 0101 = -5
        //System.out.println(~4);
        //System.out.println(2 * -3);
        //-5    正5的原码为：0000 0101，负数原码等于最高位为1：1000 0101，反码：1111 1010  补码：1111 1011。再转换为原码为：先减1变成反码 1111 1010，再取反得到原码：1000 0101 = -5
        //sum();
        //sum1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        int a = num;
        int sum = 1;
        for(;num >=1;num--){
            sum = sum * num;
        }
        System.out.println(a + "的阶乘为：" + sum);
        /*
        while(true){
            System.out.println("请输入一个整数：");
            int num = scanner.nextInt();
            if(num < 0){
                System.out.println("结束！");
                break;
            }
            System.out.println(Integer.toBinaryString(num));
        }*/


    }
}
