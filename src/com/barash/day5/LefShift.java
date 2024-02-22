package com.barash.day5;

import java.util.Arrays;
import java.util.Scanner;

public class LefShift {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5, 6};
        //{2,3,4,5,6,1}
        int n = arr.length;
        int first = arr[0];
        for (int i = 0; i < n-1 ; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1]=first;
        System.out.println(Arrays.toString(arr));

    }
}
