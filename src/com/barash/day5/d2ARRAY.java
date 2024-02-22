package com.barash.day5;

import java.util.Arrays;
import java.util.Scanner;

public class d2ARRAY {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=input.nextInt();
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
