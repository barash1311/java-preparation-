package com.barash.day10;

public class oddeven {
    public static void main(String[] args) {
        check(68);

    }
    public static void check(int n){
        if((n&1)==1){
            System.out.println("no is odd");
        }
        else{
            System.out.println("no is even");
        }
    }
}
