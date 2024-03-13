package com.barash.day10;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,2,4,5,6,5,6};
        int out=check(arr);
        System.out.println(out);

    }
    public static int check(int[] arr){
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique^=arr[i];
            }
        return unique;

    }
}
