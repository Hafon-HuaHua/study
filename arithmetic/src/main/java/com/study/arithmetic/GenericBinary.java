package com.study.arithmetic;

public class GenericBinary {

    private static void showBinary(int num){
        for(int i = 31;i >=0;i--){
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }

    }

    /**
     * 选择排序
     */
    private static void selectionSort(int[] arr){
        if(arr == null || arr.length < 2){
           return;
        }
        int N = arr.length;
        //从0 ～ N-1
        for(int i = 0;i < N;i++){
            //默认最小值的位置就是i
            int minIndex = i;
            for(int j = i + 1;j < N;j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            //从i ～N-1找到了最小值进行交换
            swapVal(arr,i,minIndex);
        }
    }

    private static void swapVal(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        //showBinary(134);
        int[] arr = {2,5,7,1,2,8,4,6,3,1};
        printVal(arr);
        selectionSort(arr);
        printVal(arr);
    }

    private static void printVal(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
