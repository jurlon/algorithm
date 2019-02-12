package com.jurlon.algorithm.sort;

import com.jurlon.algorithm.util.SortHelper;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/1/29 13:40
 * @FileName: MergeSort
 * @Description
 */
public class MergeSort extends SortHelper {
    public static  MergeSort instance = new MergeSort();
    @Override
    public void sort(int[] arr) {
        mergeSort(arr,0,arr.length-1);
    }

    private void mergeSort(int[] arr, int l, int r) {
        if(l >= r){
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int[] copy = new int[r-l+1];
        for(int i = 0 ; i < copy.length; i++){
            copy[i] = arr[i+l];
        }
        //i、j是复制后的数组坐标 k mid r 是原始数组坐标
        for(int i = 0,j = mid+1-l,k=l ; k <= r;){
            if(i+l> mid){//第一部分[l,mid]已经比较完了
                arr[k++] = copy[j++];
                continue;
            }
            if(j+l>r){//第二部分(mid,r]已经比较完了
                arr[k++] = copy[i++];
                continue;
            }
            if(copy[i] < copy[j]){//第一部分[l,mid]比较小 出列
                arr[k++] = copy[i++];
            }else{//第二部分(mid,r]比较小 出列
                arr[k++] = copy[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray(1000,1,1000);
        instance.testSort("归并排序",arr);
        printArray(arr);
    }
}
