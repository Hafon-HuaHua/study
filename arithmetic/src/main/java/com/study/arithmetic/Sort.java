package com.study.arithmetic;

/**
 * 排序
 */
public class Sort {

    /**
     * 选择排序
     * 依次从0开始找到最小索引位置，最后都循环交换完成后数组0的位置必然是最小的
     * 0 - n-1
     * 1 - n-1
     * 2 - n-1
     * 3 - n-1
     * @param arr
     */
    private static void selectSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        //4,1,6,2,7,9,3
        //1,4,6,2,7,9,3
        //1,2,4,6,7,9,3
        //1,2,3,4,6,7,9
        int n = arr.length;
        //第一次：0 - ...
        //第二次：1 - ...
        //第三次：2 - ...
        //第四次：3 - ...
        for(int i = 0;i < n; i++){
            //第一次默认索引0的位置就是最小值 0 - n-1
            //第二次索引1的位置是最小值,因为最小值其实已经找到了在0的位置，所以第二次从1开始  1 - n-1
            //第三次索引2的位置是最小值,因为最小值已经找到在1的位置，所以第三次从2开始 2 - n-1
            //第四次由于后面都已经排好序所以最终结果已经排好序
            int minValIndex = i;
            for(int j = i + 1; j < n;j++){
                //一、第一次循环
                    //第一次1跟4比较，1<4，所以最小位置索引变成1  minValIndex = 1
                    //第二次6跟1比较，6>1，所以最小位置索引不变 minValIndex = 1
                    //第三次2跟1比较，2>1，所以最小位置索引还是不变....由于是1所以后面也都不会变
                //二、第二次循环
                    //第一次6跟4比较，6>4，最小位置索引不变，minValIndex = 1
                    //第二次2跟4比较，2<4，最小位置索引发生改变，变为值2所在的位置，索引为3 minValIndex = 3
                    //第三次7跟2比较，7>2，最小位置索引不变...
                    //第四次9跟2比较，9>2，最小位置索引不变...
                    //第五次3跟2比较，3>2,最小位置索引不变...
                //三、第三次循环
                    //第一次6跟4比较，6>4，最小位置索引不变，minValIndex = 2
                    //第二次7跟4比较，7>4,最小位置索引不变
                    //第三次9跟4比较，9>4，最小位置不变
                    //第四次3跟4比较，3<4，最小位置索引变为6，minValIndex=6
                minValIndex = arr[j] < arr[minValIndex] ? j : minValIndex;
            }
            //第一次i=0,minValIndex=1 第0的位置要和min的位置做交换
            //第二次i=1,minValIndex=3 第1的位置要和min的位置交换
            //第三次i=2,minIndex=6 第2的位置要和min的位置交换
            swap(arr,i,minValIndex);
        }
    }

    /**
     * 冒泡排序
     * 0 - n-1
     * 0 - n-2
     * 0 - n-3
     * 0 - ....
     * @param arr
     */
    private static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }

    }

    /**
     * 插入排序
     * @param arr
     */
    private static void insertSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }



    }
    /**
     * 交换元素
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void printVal(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.printf(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {4,1,6,2,7,9,3,5,8,11};
        printVal(arr);
        bubbleSort(arr);
        printVal(arr);
    }
}
