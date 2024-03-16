package com.barash.day11;

public class recursion1 {
    public static void main(String[] args) {
        number(5);

    }
    public static int number(int n){
        System.out.print(n+" ");
        if(n==1){
            return 1 ;
        }
        return number(n-1);
    }
}
