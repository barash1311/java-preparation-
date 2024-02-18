package com.barash.day4;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number to check:");
        int n=input.nextInt();
        check(n);
    }
    static void check(int n){
        if(n%2==0){
            System.out.println("no is even");
        }
        else
            System.out.println("no is odd");

    }
}
