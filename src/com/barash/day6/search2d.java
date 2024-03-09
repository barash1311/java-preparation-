package com.barash.day6;

import java.util.Arrays;

public class search2d {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,20,40},
                {20,25,30,35},
                {30,35,45,50},
                {40,45,50,55}
        };
        System.out.println(Arrays.toString(search(matrix,50)));

    }
    public static int[] search(int[][] matrix,int target){
        int r=0;
        int c=matrix.length-1;
        while(r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            if(matrix[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
