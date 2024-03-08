package com.barash.day6;

public class Binary {
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] nums2={15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int out=binary(nums1,15);
        int out2=binary(nums2,15);
        System.out.println(out);
        System.out.println(out2);


    }
    public static int binary(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        boolean ans;
        if(nums[start]<nums[end]){
            ans=true;
        }
        else{
            ans=false;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            } if (ans && target>nums[mid]) {
                start=mid+1;
            }
            else if(target>nums[mid]){
                end=mid-1;
            }
            else if(target<nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
                }
            }
        return -1;
        }

}
