package com.barash.day5;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5,6,7,8,9};
        int target=5;
        int start=5;
        int end=arr.length-3;
        System.out.println(search(arr,target,start,end));
    }
    static int search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        else{
            for(int i=start;i<=end;i++){
                if(arr[i]==target){
                    return 1;
                }
            }
            return -1;
        }
    }
}
