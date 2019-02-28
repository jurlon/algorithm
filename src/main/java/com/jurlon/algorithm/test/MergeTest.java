package com.jurlon.algorithm.test;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/2/28 14:04
 * @FileName: MergeTest
 * @Description
 */
public class MergeTest {
    public static void main(String[] args) {
        int[]arr = new int[]{1,7,4,9,15,3,31,2,13,17};
        sort(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }

    private static void sort(int[] arr) {
        merge(arr,0,arr.length-1);
    }

    private static void merge(int[]arr,int left,int right){
        if(left>= right){
            return;
        }
        int mid = (left+right)/2;
        merge(arr,left,mid);
        merge(arr,mid+1,right);
        mergeSort(arr,left,right,mid);
    }

    private static void mergeSort(int[] arr, int left, int right, int mid) {
        int[] copy = new int[right-left+1];
        int oriLeft = left;
        mid++;
        int oriMid = mid;
        
        for(int i = 0 ; i < copy.length;){
            if(left>=oriMid){
                copy[i++] = arr[mid++];
                continue;
            }
            if(mid>right){
                copy[i++] = arr[left++];
                continue;
            }
            if(arr[left]<arr[mid]){
                copy[i++] = arr[left++];
            }else{
                copy[i++] = arr[mid++];
            }
            
        }
       
        for (int i = 0;i<copy.length;){
            arr[oriLeft++] = copy[i++];
        }
        
        
    }

}
