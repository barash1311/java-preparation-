package com.barash.day6;

import java.util.Arrays;

public class TWODARR {
    public static void main(String[] args) {
        int[][] nums={
                {1,2,3,5},
                {6,7,8,9,23},
                {10,11,12,13}
        };
        int target=2;
        int[] arr=arr(nums,target);
        System.out.println(Arrays.toString(arr));
        int max=largest(nums);
        System.out.println(max);

    }
    public static int[] arr(int[][] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int largest(int[][] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]>max){
                    max=nums[i][j];
                }
                else{
                    return max;
                }
            }

        }
        return max;
    }
}
