package com.barash.day10;

public class pow {
    public static void main(String[] args) {
        int n=32;
        boolean ans=(n & (n-1)) == 0;
        System.out.println(ans);
    }
}
