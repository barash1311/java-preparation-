package com.barash.day6;

public class INFINITE {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 50};
        int target=10;
        int out=ans(arr,target);
        System.out.println(out);

    }
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        //value of start may or may be larger than the target value
        //but target is always going to be greater than the end infitiaal
        while(target>arr[end]){
            int tem=end+1;
            end=end+(end-start+1)*2;
            start=tem;
        }
        return binary(arr,target,start,end);

    }
    public static int binary(int[] arr,int target,int start,int end){
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
