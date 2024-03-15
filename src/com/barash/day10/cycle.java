package com.barash.day10;

import java.util.Arrays;

public class cycle {
    public static void main(String[] args) {
        int[] arr={5,10,9,6,8,7,4,3,2,1};
        cycl(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void cycl(int[] arr){
        int i=0;
        while(i<arr.length-1){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int[] arr,int start,int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        
    }
}
