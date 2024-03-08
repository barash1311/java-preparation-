package com.barash.day6;

public class Binary {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int out=binary(nums,15);
        System.out.println(out);


    }
    public static int binary(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            } else if (target>nums[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
                }
            }
        return -1;
        }

}
