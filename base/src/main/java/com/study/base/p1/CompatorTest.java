package com.study.base.p1;

import java.util.Comparator;

public class CompatorTest implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
