package com.barash.day7;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last= arr.length-i-1;
            int max=max(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int max(int[] arr,int start,int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]>arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}
