package com.barash.day11;

public class recursion2 {
    public static void main(String[] args) {
        easy(5);
    }
    public static void easy(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        easy(n-1);
        System.out.print(n+" ");
    }
}
