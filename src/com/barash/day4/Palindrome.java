package com.barash.day4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number to check:");
        int n=input.nextInt();
        CheckPalindrome(n);

    }
    static void CheckPalindrome(int n){
        //101==101
       int originalno=n;
        int reverse=0;
        while(n!=0){
            int remainder=n%10;
            reverse=reverse*10+remainder;
            n/=10;
        }
        if(originalno==reverse){
            System.out.println("no is palindrome");
        }
        else
            System.out.println("not a palindrome");
    }
}
