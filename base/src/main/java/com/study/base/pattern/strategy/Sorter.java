package com.study.base.pattern.strategy;

import java.util.Comparator;

/**
 * 只需要调用类实现Compareable接口即可
 */
public class Sorter<T> {

    /**
     * 冒泡排序
     * @param arr
     */
    public void sort(T[] arr, Comparator<T> comparator){
        if(arr.length < 1){
            return;
        }
        for(int i = 0; i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(comparator.compare(arr[i],arr[j]) == 1){
                    swap(arr,i,j);
                }
            }
        }
    }

    /**
     * 交换元素
     * @param arr
     * @param i
     * @param j
     */
    private void swap(T[] arr, int i, int j){
        T temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        //Integer[] a = new Integer[]{3,2,1,6,4,8,9,5,7};
        Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        //Dog[] a = {new Dog(4),new Dog(1),new Dog(3)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(a,new CatHeightCompator());
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + ",");
        }
    }
}
