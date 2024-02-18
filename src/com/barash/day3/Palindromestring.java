package com.barash.day3;

import java.util.Scanner;

public class Palindromestring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the string to check:");
        String orginal = input.next();
        String reverse = "";
        for (int i = orginal.length() - 1; i >=0; i--) {
            reverse += orginal.charAt(i);
        }
        if (orginal.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
