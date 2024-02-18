package com.barash.day5;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for (int j : arr) {
            System.out.println(j);
        }
//        System.out.println();
//        for(int num:arr){
//            System.out.println(arr[num]);
//        }

    }
}
