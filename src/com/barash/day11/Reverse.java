package com.barash.day11;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(12345));

    }
    public static int  reverse(int n){
        if(n==0){
            return 0;
        }
        int last=n%10;
        return  last+reverse(n/10);

    }
}
