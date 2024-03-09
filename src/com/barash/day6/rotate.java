package com.barash.day6;

public class rotate {
    public static void main(String[] args) {

        int[] arr={7,8,9,11,1,2,3,4,5,6};
        int largest=Pivot(arr);
        int target=7;
        /*if(largest==-1){
            return binary(arr,target,0,arr.length-1);
        }
        if(arr[largest]==target){
            return largest;
        }
        if(target>arr[0]) {
            return binary(arr,target,0,largest-1);
        }
            return binary(arr,target,largest+1, arr.length-1);

*/
    }
    public static int binary(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

    }
    public static int Pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        //{7,8,9,1,2,3,4,5,6}
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid<start && arr[mid]<arr[mid-1]){
                return mid-1;
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
}
