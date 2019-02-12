package com.jurlon.algorithm.num;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/2/12 14:05
 * @FileName: CommonNum
 * @Description 求最大公约数 最小公倍数
 */
public class CommonNum {
    
    public static void main(String[] args) {
        long num1 = 17124;
        long num2 = 8112;
        System.out.println("最大公约数：" + calGCD(num1,num2));
        System.out.println("最小公倍数：" + calLCM(num1,num2));
    }
    
    /**
     * @Author: jurlon@163.com
     * @Date: 2019/2/12 14:20
     * @Description: 最小公倍数 两数只积除以最大公约数
     */   
    public static long calLCM(long num1 ,long num2){
        return num1 / calGCD(num1,num2) * num2;
    }
    
    /**
     * @Author: jurlon@163.com
     * @Date: 2019/2/12 14:21
     * @Description: 最大公约数 辗转相除法
     */
    public static long calGCD(long num1 ,long num2){
        long bigNum = num1>num2?num1:num2;
        long smallNum = num1<= num2?num1:num2;
        long remain = bigNum % smallNum;
        if(remain == 0L){//余数为0 返回小数
            return smallNum;
        }
        //余数不为0
        return calGCD(smallNum,remain);
    }
}
// 8 = 2*2*2
// 6 = 2*3