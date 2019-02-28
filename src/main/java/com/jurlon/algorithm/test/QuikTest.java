package com.jurlon.algorithm.test;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/2/28 15:23
 * @FileName: QuikTest
 * @Description
 */
public class QuikTest {
    public static void main(String[] args) {
        int[]arr = new int[]{1,7,4,9,15,3,31,2,13,17};
        sort(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }

    private static void sort(int[] arr) {
        quikSort(arr,0,arr.length-1);
    }
    private static void quikSort(int[]arr ,int left,int right){
        if(left>=right){
            return;
        }
        int partition = partion(arr,left,right);
        quikSort(arr,left,partition);
        quikSort(arr,partition+1,right);
    }

    private static int partion(int[] arr, int left, int right) {
        int value = arr[left];
        int position = left;
        for(int i = left+1;i<=right;){
            if(arr[i]>=value){
                swap(arr,i,right--);
            }else {
                i++;
                position ++;//positon 比 i小 1
            }
            
        }
        swap(arr,left,position);
        return position;
    }
    private static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
