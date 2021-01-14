package com.study.base.pattern.iterator;

/**
 * 手写简单ArrayList
 */
public class ArrayList {
    private Object[] objects = new Object[5];
    private int index = 0;
    public void add(Object object){
        if(index == objects.length){
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects = newObjects;
        }
        objects[index] = object;
        index++;
    }
    public int size(){
        return objects.length;
    }
    public int get(int index){
        return Integer.valueOf(objects[index].toString());
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for(int i = 0;i<10;i++){
            list.add(1 + i);
        }
        System.out.println(list.size());
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
