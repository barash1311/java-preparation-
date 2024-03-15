package com.barash.day10;

public class sqrtBinary {
    public static void main(String[] args) {
        System.out.printf("%.3f",square(40,8));

    }
    public static double square(int n,int p){
        int start=0;
        int end=n;

        double root=0.0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid<n){
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        double inc=0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n){
                root+=inc;
            }
            root-=inc;

        }
        return root;


    }
}
