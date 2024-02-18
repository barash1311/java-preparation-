package com.barash.day2;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the no for while you want to check factors:");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println("the sum is :"+ sum);
    }
}
