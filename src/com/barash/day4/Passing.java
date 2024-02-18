package com.barash.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Passing {
    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        /*int[] arr = {1, 2, 3, 4, 55};
        change(arr);
        System.out.println(Arrays.toString(arr));*/
        length(2,3,4,4,5,0,34,3,43,4,34,34,3);
        len(1,2,3,4,4,5,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6);

    }


    static void change(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]++;
        }
    }
    static void length(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void len(int ...r){
        System.out.println(Arrays.toString(r));
    }
}
