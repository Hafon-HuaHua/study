package com.study.base.pattern.responsibilitychain;

public class Banzhuren extends Handle {
    @Override
    public void handleRequest(int day) {
        if(day < 1){
            return;
        }
        if(day <= 2){
            ok();
        }else if(getNext() != null){
            getNext().handleRequest(day);
        }else{
            System.out.println("班主任下没有要处理的对象了");
            return;
        }
    }
    private void ok(){
        System.out.println("班主任批准");
    }
}
