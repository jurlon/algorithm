package com.jurlon.algorithm.print;

/**
 * @Author: jurlon@163.com
 * @DateTime: 2019/2/15 9:57
 * @FileName: PrintMagic
 * @Description
 */
public class PrintMagic {
    public static void main(String[] args) {
        int[][] arr = buildArr(1);
        printArr(arr);
        System.out.println();
        System.out.println();
        /*printArr(changePositive(arr));*/
        printArr(changeNegative(arr));
    }
    public static int SP = 3;
    public static void print(String s){
        for(int i=SP-s.length();i>0;i-- ){
            System.out.print(" ");
        }
        System.out.print(s);
        System.out.print(" ");
    }
    public static void printArr(int[][] arr){
        for(int j =0;j<arr.length;j++){
            for(int i = 0 ; i<arr[j].length;i++){
                print(arr[j][i]+"");
            }
            System.out.println();
        }
    }
    public static int[][] buildArr(int n){
        int row = n*2+1;
        int[][] arr = new int[row][row];
        int direction = 1;// 1:水平减 2:垂直增 3:水平增 4:垂直减
        int i = row;
        int j = 1;
        int num = row*row;
        while (num>0){
            arr[j-1][i-1] = num--;
            if(direction == 1){
                if(i>j){
                    i --;
                }else{
                    direction = 2;
                    j++;
                }
                
            } else if(direction == 2){
                if(j < row+1-i){
                    j++;
                }else {
                    direction = 3;
                    i++;
                }
            }
            else if(direction == 3){
                if(i<j){
                    i++;
                }else {
                    direction = 4;
                    j--;
                }
            }
            else if(direction == 4){
                if(j>(row+2-i)){
                    j--;
                }else{
                    direction = 1;
                    i--;
                }
            }
           
        }
        return arr;
        
    }
    //矩阵顺转换90度，则原矩阵的纵下标转变为新矩阵的横下标；原矩阵的横下标转变为新矩阵的纵下标，并且顺序相反。
    public static int[][] changePositive (int [][]arr){
        int [][]temp=new int[arr[0].length][arr.length];
        int dst=arr.length-1;
        for(int i=0;i<arr.length;i++,dst--){
            for(int j=0;j<arr[0].length;j++){
                temp[j][dst]=arr[i][j];
            }
        }
        return temp;
    }
    //矩阵逆时针旋转90度
    public static int[][] changeNegative (int [][]arr){
        int [][]temp=new int[arr[0].length][arr.length];
        for(int i =0 ; i<arr.length;i++){
            int dst=arr[0].length-1;
            for (int j = 0 ; j < arr[0].length;j++,dst--){
                temp[dst][i]=arr[i][j]; 
            }
        }
        
        return temp;
    }
}
   
//21 22 23 24 25
//20  7  6  5  4
//19  8  1  2  3
//18  9 10 11 12
//17 16 15 14 13

//j=1 i:5-->1;
//i=1 j:1-->5;
//j=5 i:1-->5
//i=5 j:5--2


//row*row-(row)+1 row*row-(row)+2 ... row*row-(row)+row
//row*row-(row)
//row*row-(row)-1
//row*row-(row)-2
//....
//row*row-(row*2)+2

// 0,0  0,1  0,2
// 1,0  1,1  1,2
// 2,0  2,1  2,2



//0,2 1,2 2,2
//0,1 1,1 2,1
//0,0 1,0 2,0