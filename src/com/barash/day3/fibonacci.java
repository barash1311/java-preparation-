package com.barash.day3;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number to check the fbinonacci series:");
        int n=input.nextInt();
        int a=0;
        int b=1;
        // 0 1 1 2 3 5 8
        //here we use  a for loop as we know the end value of the loop
        //and if we don't know the end condition we use the while loop
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            int next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;

        }
    }
}
