package com.barash.day5;

public class LinearSerach {
    public static void main(String[] args) {
        int[] nums={1,3,2,4,-1,5,8,7,66};
        int target=99;
        int ans=linearsearch(nums,target);
        System.out.println("ans is:"+ans);
    }
    static int linearsearch(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
        }

    }
}
