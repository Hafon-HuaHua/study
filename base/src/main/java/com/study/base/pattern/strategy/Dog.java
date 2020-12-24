package com.study.base.pattern.strategy;

public class Dog implements CompareAble<Dog> {

    private int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog d){
        if(this.food < d.food){
            return -1;
        }else if(this.food > d.food){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
