package com.barash.day2;

import java.util.Scanner;

public class Palindromenum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=input.nextInt();
        int original=n;
        int reverse=0;
        while(n!=0){
            int last=n%10;
            reverse=reverse*10+last;
            n/=10;
        }
        if(original==reverse){
            System.out.println("no is pailndrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
