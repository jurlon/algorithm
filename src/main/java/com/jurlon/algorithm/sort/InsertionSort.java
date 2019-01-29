package com.jurlon.algorithm.sort;

import com.jurlon.algorithm.util.SortHelper;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/1/29 11:35
 * @FileName: InsertionSort
 * @Description
 */
public class InsertionSort extends SortHelper {
    public static  InsertionSort instance = new InsertionSort();
    @Override
    public void sort(int[] arr) {
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = i ; j >0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public void sort(int[] arr,int l , int r) {
        for(int i = l+1 ; i <= r ; i++){
            for(int j = i ; j >0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100,1,10000);
        instance.sort(arr,0,arr.length-1);
       // instance.testSort("插入排序",arr);
        printArray(arr);
        //  SelectionSort.instance.testSort("选择排序",arr);
    }
}
