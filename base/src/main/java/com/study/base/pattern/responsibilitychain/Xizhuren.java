package com.study.base.pattern.responsibilitychain;

public class Xizhuren extends Handle{
    @Override
    public void handleRequest(int day) {
        if(day < 1){
            return;
        }
        if(day <= 7){
            ok();
        }else if(getNext() != null){
            getNext().handleRequest(day);
        }else{
            System.out.println("系主任下没有要处理的对象了");
            return;
        }
    }

    private void ok() {
        System.out.println("系主任批准");
    }
}
