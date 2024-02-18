package com.barash.day1;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number to check:");
        int num=input.nextInt();
        System.out.println("enter the no for which you want occurence :");
        int n=input.nextInt();
        int count=0;
        while(num>0){
            int check=num%10;
            if(check==n){
                count++;
            }
            num/=10;
        }
        System.out.println("occurnece is:"+count);
    }
}
