package com.barash.day10;

public class magical {
    public static void main(String[] args) {
        System.out.println(mag(6));

    }
    public  static int mag(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n & 1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
}
