package com.barash.day10;

public class NUM {
    public static void main(String[] args) {
        int num=2345;
        int base=10;
        int ans=(int)((Math.log(num)/Math.log(base))+1);
        System.out.println(ans);

    }
}
