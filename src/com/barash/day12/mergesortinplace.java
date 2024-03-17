package com.barash.day12;

import java.util.Arrays;

public class mergesortinplace {
    public static void main(String[] args) {
        int[] arr={2,1,5,3,4};
        msort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void msort(int[] arr,int start,int end){
        if(end-start==1){
            return;
        }
        int mid=start+(end-start)/2;
        msort(arr,start,mid);
        msort(arr,mid,end);

         merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end){
        int[] mix=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[l+start]=mix[l];
        }

    }
}
