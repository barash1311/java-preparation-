package com.barash.day9;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibn(50));
    }
    public static int fibn(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibn(n-1)+fibn(n-2);
    }
}
