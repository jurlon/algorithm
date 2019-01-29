package com.jurlon.algorithm.sort;

import com.jurlon.algorithm.util.SortHelper;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/1/29 10:31
 * @FileName: SelectionSort
 * @Description
 */
public class SelectionSort extends SortHelper {
    public static SelectionSort instance = new SelectionSort();
    @Override
    public void sort(int [] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int minIndex = i;
            for(int j = i+1 ; j < arr.length; j++ ){
                if(arr[i] > arr[j]){
                    minIndex = j ;
                }
            }
            swap(arr,i,minIndex);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100000,1,10000);
        instance.testSort("选择排序",arr);
    }
    
    
    
}
