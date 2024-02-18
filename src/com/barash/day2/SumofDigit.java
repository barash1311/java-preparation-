package com.barash.day2;

import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number :");
        int n=input.nextInt();
        int sum=0;
        while(n!=0){
            int remainder=n%10;
            sum+=remainder;
            n/=10;
        }
        System.out.println("total sum is:"+sum);
    }
}
