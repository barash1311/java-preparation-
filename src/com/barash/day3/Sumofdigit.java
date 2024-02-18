package com.barash.day3;

import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the numbeers (press 0 for exit)");
        int n=input.nextInt();
        int sum=n;
        int count=1;
        while(n!=0){
            System.out.println("enter another number:");
            n=input.nextInt();
            sum+=n;
            count++;
            if(n==0){
                break;
            }

        }
        System.out.print("sum is "+sum);

    }
}
