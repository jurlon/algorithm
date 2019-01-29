package com.jurlon.algorithm.util;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/1/29 9:55
 * @FileName: SortHelper
 * @Description
 */
public abstract class SortHelper {
    /**
     * @Author: jurlon@163.com
     * @Date: 10:07 2019/1/29
     * @Description: 生成指定范围数组
     */
    public static int[] generateRandomArray(int n, int range_l, int range_r){
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = new Random().nextInt(range_r-range_l+1)+range_l;
        }
        return arr;
    }
    /*
     * @Author: jurlon@163.com
     * @Date: 10:09 2019/1/29
     * @Description: 生成近似有序数组
     */
    public static int[] generateNearlyOrderedArray(int n, int swapTimes){
        int[] arr = new int[n];
        for (int i = 0 ; i < n ;i++){
            arr[i] = i;
        }
        for(int i = 0 ; i < swapTimes; i++){
            swap(arr,new Random().nextInt(n),new Random().nextInt(n));
        }
        return arr;
    }
    /**
     * @Author: jurlon@163.com
     * @Date: 10:18 2019/1/29
     * @Description: 交换
     */
    public static void swap(int[] arr,int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    /**
     * @Author: jurlon@163.com
     * @Date: 10:19 2019/1/29
     * @Description: 打印数组
     */
    public static void printArray(int[] arr){
        for(int a : arr){
            System.out.print(a+",");
        }
        System.out.println();
    }
    
    /**
     * @Author: jurlon@163.com
     * @Date: 10:22 2019/1/29
     * @Description: 拷贝数组
     */
    public static int[] copyIntArray(int[] arr){
        int[] result = new int[arr.length];
        for(int i =0 ; i < arr.length ; i++){
            result[i] = arr[i];
        }
        return result;
    }
    
    /**
     * @Author: jurlon@163.com
     * @Date: 10:29 2019/1/29
     * @Description: 数组是否从小到大排列
     */
    public static boolean isSorted(int[] arr){
        for(int i = 0 ; i < arr.length -1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    } 
    public void testSort(String sortName,int[] arr){
        long start = new Date().getTime();
        sort(arr);
        long end = new Date().getTime();
        System.out.println(sortName +" "+new BigDecimal(end-start).divide(new BigDecimal(1000),3,BigDecimal.ROUND_HALF_DOWN));
    }
    public void testSortUseCopy(String sortName,int[] arr){
        int[] curr = copyIntArray(arr);
        long start = new Date().getTime();
        sort(curr);
        long end = new Date().getTime();
        System.out.println(sortName +" "+new BigDecimal(end-start).divide(new BigDecimal(1000),3,BigDecimal.ROUND_HALF_DOWN));
    }
    public static void main(String[] args) {
        printArray(generateNearlyOrderedArray(100,10));
    }
    public void sort(int [] arr){
    }
}
