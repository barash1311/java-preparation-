package com.barash.day2;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter the no :");
        int n=input.nextInt();
        int sum=n;
        while(n!=0){
            System.out.println("enter the no :");
            n=input.nextInt();
            sum+=n;
        }
        System.out.println("the sum is :"+sum);
    }
}
