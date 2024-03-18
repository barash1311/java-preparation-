package com.barash.day13;

public class Mazing {
    public static void main(String[] args) {
        System.out.println(maxe(2,3));

    }
    static int maxe(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=maxe(r-1,c);
        int right=maxe(r,c-1);
        return left+right;
    }
}
