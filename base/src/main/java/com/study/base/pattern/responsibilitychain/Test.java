package com.study.base.pattern.responsibilitychain;

/**
 * 分析：假如规定学生请假小于或等于 2 天，班主任可以批准；小于或等于 7 天，系主任可以批准；小于或等于 10 天，院长可以批准；
 * 其他情况不予批准；这个实例适合使用职责链模式实现
 */
public class Test {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.handleRequest(8);
        /*Handle handle = new Banzhuren();
        Handle handle1 = new Xizhuren();
        Handle handle2 = new Xiaozhang();
        handle.setNext(handle1);
        handle1.setNext(handle2);
        handle.handleRequest(9);*/
    }


}
