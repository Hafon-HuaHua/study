package com.study.base.pattern.responsibilitychain;

public class Xiaozhang extends Handle{
    @Override
    public void handleRequest(int day) {
        if(day < 1){
            return;
        }
        if(day <= 10){
            ok();
        }else if(getNext() != null){
            getNext().handleRequest(day);
        }else{
            System.out.println("校长下没有待处理对象,没法审批这个了");
            return;
        }
    }

    private void ok() {
        System.out.println("校长批准");
    }
}
