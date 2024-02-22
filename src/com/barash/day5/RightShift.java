package com.barash.day5;

import java.util.Arrays;

public class RightShift {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        //{6,1,2,3,4,5}
        int last=arr[arr.length-1];
        int count=0;
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
            count++;
        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }
}
