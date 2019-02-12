package com.jurlon.algorithm.num;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/2/12 13:48
 * @FileName: PrimeNum
 * @Description 分解质因数
 */
public class PrimeNum {
    
    public static void main(String[] args) {
        cal(26);
    }
    public static void cal(long num){
        long len = num/2+1;
        for(long i = 2 ; i<= len;){
            if(num%i == 0){
                System.out.println(i+" ");
                num = num / i;
                len = num;
            }else{
                i++;
            }
        }
    }
    
}
