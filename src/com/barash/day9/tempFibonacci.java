package com.barash.day9;

public class tempFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(50));
        //0 1 1 2 3
        //

    } 
    public static int fibonacci(int n){
        //base conditon are give that seaies start from 0 1 and continued but the sum of the future indices
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
