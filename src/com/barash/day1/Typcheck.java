package com.barash.day1;

import java.util.Scanner;

public class Typcheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the character to check:");
        char ch=input.next().trim().charAt(0);
        if(ch >= 'a' && ch<='z'){
            System.out.println("Lower case");
        }
        else{
            System.out.println("Upper case");
        }
    }
}
