package com.barash.day7;

import java.util.Arrays;

public class BUBBLE_SORTING {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean ref=false;
            for(int j=1;j<=arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    ref=true;
                }
            }
            if(!ref){
                break;
            }
        }


    }
}
