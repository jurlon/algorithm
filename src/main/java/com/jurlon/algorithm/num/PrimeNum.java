package com.jurlon.algorithm.num;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/2/12 13:48
 * @FileName: PrimeNum
 * @Description 分解质因数
 */
public class PrimeNum {
    
    public static void main(String[] args) {
       // cal(26);
        findPrimeNum(50000,100000);
    }
    public static void cal(long num){
        long len = num/2+1;
        for(long i = 2 ; i<= len;){
            if(num%i == 0){
                System.out.print(i+" ");
                num = num / i;
                len = num;
            }else{
                i++;
            }
        }
    }
    
    public static void findPrimeNum(long starNum,long endNum){
        for(long i = starNum; i <= endNum; i++){
            if(isPrimeNum(i)){
                System.out.print(i+" ");
            }
        }
        
        
        
    }
    public static boolean isPrimeNum(long num){
        if(num < 2){
            return false;
        }
        for(long i = 2; i<= num/2;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
