package com.barash.day2;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number for checking");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }}

            if (n == sum) {
                System.out.println("it is a perfect number:");

            }
            else{
                System.out.println("not a perfact number");
            }
        }
    }

