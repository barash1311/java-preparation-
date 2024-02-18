package com.barash.day2;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter the year:");
        int n=input.nextInt();
        if((n%4==0 && n%100!=0)||(n%400 == 0)){
            System.out.println("its a leap year:");
}else{
            System.out.println("not a leap");
        }
    }
}
