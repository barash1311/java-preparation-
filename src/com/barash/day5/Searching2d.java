package com.barash.day5;

import java.util.Arrays;

public class Searching2d {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6,7},
                      {8,9,10}
        };
        int target=11;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] nums,int target){
        if(nums.length==0){
            return new int[]{};
        }
        else{
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[i].length;j++){
                    if(nums[i][j]==target){
                        return new int[]{i,j};
                    }
                }


            }
            return new int[]{-1,-1};
        }
    }

}
