package com.barash.day5;

public class Binary {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 2;
        int ans = search(nums, target);
        System.out.println("the index is :" + ans);
    }

    //[1,2,3,4,5,6,7,8,9,10]
    static int search(int[] arr,int target){
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
        return -1;
    }
}
