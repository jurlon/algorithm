package com.jurlon.algorithm.sort;

import com.jurlon.algorithm.util.SortHelper;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/1/29 14:47
 * @FileName: QuickSort
 * @Description
 */
public class QuickSort extends SortHelper {
    public static QuickSort instance = new QuickSort();
    @Override
    public void sort(int[] arr) {
        quickSort(arr,0, arr.length-1);
    }

    public void quickSort(int[] arr, int l, int r) {
        if(l >= r){
            return;
        }
        //找出切分点
        int posion = partition(arr,l,r);
        quickSort(arr,l,posion);
        quickSort(arr,posion+1,r);
    }

    private int partition(int[] arr, int l, int r) {
        //查找value应该在的位置posion
        //得到的posion左边的值小于value 右边的值大于或者等于value
        int posion = l;
        int value = arr[posion];
        for(int i = l+1;i <= r ; i++){
            //摘出来比value小的值
            if(arr[i] < value){//如果当前值比value小 将posion向后移动一个位置 并把当前值(arr[i]) 放到posion上
                posion ++;
                if(posion != i){
                    swap(arr, posion,i);
                }
            }
        }
        swap(arr,l,posion);
        return posion;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray(1000000,1,1000000);
        instance.testSort("快速排序",arr);
       // printArray(arr);
    }
}
