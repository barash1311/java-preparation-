package com.barash.day7;

import com.barash.day6.Array;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr={5,10,9,6,8,7,4,3,2,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static void cycle(int[] arr){
        int i=0;
        while(i<=arr.length-1){
            int correct=arr[i]-1;//index=val-1
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
            i++;}
        }

    }
}
