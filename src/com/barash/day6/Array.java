package com.barash.day6;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] nums=new int[3][3];
        array(nums);


    }
    public static void array(int[][] nums){
        Scanner input=new Scanner(System.in);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println(" ");
        }
    }
}
