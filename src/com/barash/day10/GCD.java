package com.barash.day10;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(0,300));
        int a=2;
        int b=4;
        int lcm=(a*b)/gcd(a,b);
        System.out.println(lcm);

    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}

