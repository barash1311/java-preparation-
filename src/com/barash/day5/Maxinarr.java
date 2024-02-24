package com.barash.day5;

public class Maxinarr {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5, 6, 7, 99};
        int mAx=max(arr);
        int mIn=min(arr);
        System.out.println(mAx);
        System.out.println(mIn);
    }

    static int max(int[] arr) {
        int max = 0;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }
    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }
    }

}
