package com.barash.day6;

public class SortedARRAY {
    public static void main(String[] args) {

    }
    static int[] binary(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int row= matrix.length;
        int column= matrix[0].length;
        if(column==0){
            return new int[]{-1,-1};
        }
        if(row==1){
            return binary(matrix,0,0,column-1,target);

        }
        int rStart=0;
        int rEnd=row-1;
        int mid=column/2;
        

    }

}
