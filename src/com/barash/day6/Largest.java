package com.barash.day6;

public class Largest {
    public static void main(String[] args) {
        int[] arr={6,2,0,3,4};
        int m=2;
        int n=splitArray(arr,m);
        System.out.println(n);

    }
    public static int splitArray(int[] nums, int m){
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for(int i=0;i<nums.length;i++){
                if(sum+i>mid){
                    sum=i;
                }
                else{
                    sum+=i;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }

}
