package com.barash.day9;

public class numbers {
    public static void main(String[] args) {
        num(1);
    }
    public static  void num(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        num(n+1);
    }
}
