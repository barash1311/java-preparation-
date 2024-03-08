package com.barash.day6;

public class RowSum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{23,4,5}};
        int out=sum(arr);
        System.out.println(out);

    }
    public static int sum(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int accounts=0;accounts<arr.length;accounts++){
            int rowsum=0;
            for(int person=0;person<arr[accounts].length;person++){
                rowsum+=arr[accounts][person];
                if(rowsum>max){
                    max=rowsum;
                }
            }

        }
        return max;




    }
}
