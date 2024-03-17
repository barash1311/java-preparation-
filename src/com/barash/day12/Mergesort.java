package com.barash.day12;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr={2,1,5,3,4};
        System.out.println(Arrays.toString(msort(arr)));

    }
    public static int[] msort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=msort(Arrays.copyOfRange(arr,0,mid));
        int[] right=msort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int[] mix=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;

    }
}
