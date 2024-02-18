package com.barash.day1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a string to check:");
        String str=input.next();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Palindrome");

        }else{
            System.out.println(" not palindrome");
        }
    }
}
