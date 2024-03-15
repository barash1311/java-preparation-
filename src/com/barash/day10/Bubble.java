package com.barash.day10;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr.length-i-1;j++) {
                boolean ref=false;
                //1,0,2,
                if (arr[j] < arr[j - 1]) {
                    int temp=arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    ref=true;
                }
                if(!ref){
                    break;
                }
            }

        }
    }
}
