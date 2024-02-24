package com.barash.day5;

public class Order {
    public static void main(String[] args) {
        int[] arr={-18,-17,2,3,4,5,6,7,8,9,10};
        int target=2;
        int ans=search(arr,target);
        System.out.println("ans is :"+ans);

    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isOR=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isOR){
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
            else{
                //18/17/16 25 14 13 12
                    if(target>arr[mid]){
                        end=mid-1;
                    }
                    else if(target<arr[mid]){
                        start=mid+1;
                    }
                    else{
                        return mid;
                    }

            }

        }
        return -1;
    }
}
