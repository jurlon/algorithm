package com.jurlon.algorithm.test;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/2/28 13:59
 * @FileName: SelecetTest
 * @Description
 */
public class SelecetTest {

    public static void main(String[] args) {
        int[]arr = new int[]{1,7,4,9,15,3,31,2,13,17};
        sort(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }
    
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
}
