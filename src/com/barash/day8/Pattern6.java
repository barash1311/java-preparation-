package com.barash.day8;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
        
    }
    public static void pattern6(int n){
        for(int row=0;row<2*n;row++){
            //now we need a relation ship between the column and the rows
            int c=row>n ? 2*n-row:row;
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
