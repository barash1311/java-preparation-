package com.barash.day6;

public class Celing {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,15,17};
        int target=16;
        int ans=celiing(arr,target);
        System.out.println("index is :"+ans);

    }
    static int  celiing(int[] arr,int target){
        //{1,2,3,4,5,6,7,8,9,10}
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }

        }
        return start;
    }
}
