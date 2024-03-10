package com.barash.day8;

public class Pattern {
    public static void main(String[] args) {
        pattern(5);

    }
    public static void pattern(int n){
        //step-1
        //identify the no of time row is there  n
        for(int i=1;i<=n;i++){
            //identify for each row how many columns are there
            //*
            //* *
            //* * *
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
