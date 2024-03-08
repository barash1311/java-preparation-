package com.barash.day6;

public class ROTATed {
    public static void main(String[] args) {

    }
    public int search(int[] nums,int target){
        int pivot=pivot(nums);
        if(pivot==-1){
            return binarysearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[pivot]>=nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1, nums.length-1);

    }


    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                end=mid-1;
            }
            else if(arr[mid]>target){
                start=end+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }//{3,4,5,6,7,0,1,2}
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
