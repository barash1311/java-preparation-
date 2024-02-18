package com.barash.day3;

import java.util.Scanner;

public class Palindromenum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter the numer for whivh  your want to check:");
        int n=input.nextInt();
        int original=n;
        int reverse=0;
        while(n!=0){
            int remainder=n%10;
            reverse=reverse*10+remainder;
            n/=10;
        }

        if(original==reverse){
            System.out.println("no is palindrome");
        }
        else{
            System.out.println("no is not palindrome");
        }

    }
}
