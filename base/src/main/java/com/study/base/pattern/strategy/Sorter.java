package com.study.base.pattern.strategy;

public class Sorter {

    public static void sort(CompareAble[] arr){
        if(arr.length < 1){
            return;
        }
        for(int i = 0; i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[i].compareTo(arr[j]) == 1){
                    swap(arr,i,j);
                }
            }
        }
    }
    private static void swap(CompareAble[] arr, int i, int j){
        CompareAble temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        //int[] a = {3,2,1,6,4,8,9,5,7};
        Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        //Dog[] a = {new Dog(4),new Dog(1),new Dog(3)};
        sort(a);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + ",");
        }
    }
}
