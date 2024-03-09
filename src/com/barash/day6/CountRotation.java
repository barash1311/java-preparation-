package com.barash.day6;

public class CountRotation {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int count=countrotation(arr);
        System.out.println(count);

    }
    static int countrotation(int[] arr){
        int result=Pivot(arr);
        return result+1;
    }
    static int Pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //{7,8,1,2,3,4,5,6}
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]>=arr[start]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    static int duplicate(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid >start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //for duplicate
            //if middle start and end are duplicate
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //checking if start is pivt
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                else if(arr[start]<arr[mid]||arr[start]==arr[mid]&& arr[mid]>arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
