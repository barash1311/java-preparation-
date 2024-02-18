package com.barash.day2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        int count=0;
        int sum=0;
        while(true){
            System.out.print("enter the number:");
            n= input.nextInt();
            sum+=n;
            count++;
            if(n==0){
                break;
            }
        }
        System.out.println("the sum is :"+sum);
        System.out.println("the average is :"+(float)(sum/count));
    }
}
