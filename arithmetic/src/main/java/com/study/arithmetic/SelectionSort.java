package com.study.arithmetic;

/**
 * 选择排序
 */
public class SelectionSort {

    private static void selectionSort(int[] arr){
        //如果数组等于空或者只有一个数则返回
        if(arr == null || arr.length < 2){
            return;
        }
        //0 ~ n - 1
        //1 ~ n - 1
        int n = arr.length;
        for(int i = 0;i<n;i++){ //0，1，2....
            int minValIndex = i;
            for(int j = i+1;j<n;j++){//第2个数与第1个数比较，小的记录索引位置并替换
                minValIndex = arr[j] < arr[minValIndex] ? j : minValIndex;
            }
            swap(arr,i,minValIndex);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private static void printNum(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,1,7,6,5,4,2,8,3};
        printNum(arr);
        // 0 ~ n-1
        // 1 ~ n-1
        // 2 ~ n-1
        //每次比较都排除前面已经找到的最小数
        selectionSort(arr);
        printNum(arr);
    }
}
