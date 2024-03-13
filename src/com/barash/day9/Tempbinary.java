package com.barash.day9;

public class Tempbinary {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=9;
        int out=search(arr,target,0, arr.length-1);
        System.out.println(out);

    }

    public static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);


    }
}
