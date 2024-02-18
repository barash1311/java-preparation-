package com.barash.day4;

import java.util.Scanner;

public class Sumfunction {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the first no:");
        int num1=input.nextInt();
        System.out.println("enter the first no:");
        int num2=input.nextInt();
        int ans=sum(num1,num2);
        System.out.println("the sum is :"+ans);
    }
    static int sum(int a,int b){
        return a+b;
    }
}
