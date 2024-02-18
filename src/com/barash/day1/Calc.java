package com.barash.day1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("enter the first no:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("enter the first no:");
        int num2 = input.nextInt();
        System.out.println("enter your choice \n 1.addition\n2.subtraction\n3.multiplication\n4.division\n");
        System.out.println("enter your choice:");
        int c = input.nextInt();
        if (c == 1) {
            System.out.println("result is:" + (num1 + num2));
        } else if (c == 2) {
            System.out.println("result is:" + (num1 - num2));
        } else if (c == 3) {
            System.out.println("result is:" + (num1 * num2));
        } else {
            if (num1 > num2) {
                System.out.println("result is " + (num1 / num2));
                System.out.println("num1 is greater");
            } else {
                System.out.println("numbrer 2 is greater");
            }
        }
    }
}


