package com.barash.day1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number upto which you wan the series:");
        int n=input.nextInt();
        int a=0;
        int b=1;
        //0 1 1 2 3 5 8 13
        System.out.print(a+" "+ b+" ");
        for(int i=2;i<n;i++){
            int next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;

        }

    }
}
