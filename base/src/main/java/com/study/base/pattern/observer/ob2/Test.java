package com.study.base.pattern.observer.ob2;

public class Test {
    public static void main(String[] args) {
        /*BadMan bm = new BadMan();
        Observer o1 = new GoodMan();
        Observer o2 = new GoodMan2();
        bm.addObserver(o1);
        bm.addObserver(o2);
        bm.run();*/
        String path = "applicationContest-${url}.xml";
        System.out.println(path.indexOf("${"));
    }
}
