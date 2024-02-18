package com.barash.day5;

import java.util.Arrays;
import java.util.Scanner;

public class INPUT {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        int[] arr2=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for (int j : arr) {
            System.out.println(j);
        }
        for(int num:arr2){
            arr2[num]=input.nextInt();
        }
        for(int i:arr2){
            System.out.println(arr2[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
