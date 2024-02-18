package com.barash.day5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr=new int[5];

        String[] str=new String[5];
        System.out.println(str[0]);
        str[0]="a";
        System.out.println(Arrays.toString(str));
    }
}
