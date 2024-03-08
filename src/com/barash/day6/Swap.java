package com.barash.day6;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
        int max=Max(arr);
        System.out.println(max);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int Max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        //
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
}
