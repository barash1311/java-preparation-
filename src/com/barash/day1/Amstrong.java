package com.barash.day1;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 100;
        int end = 999;
        for (int i = start; i <= end; i++) {
            int originalnum = i;
            int n = 0;
            double result = 0;
            while (originalnum != 0) {
                originalnum /= 10;
                n++;
            }
            originalnum = i;
            while (originalnum != 0) {
                int remainder = originalnum % 10;
                result += Math.pow(remainder, n);
                originalnum /= 10;
            }
            if (result == i) {
                System.out.println(i + " is amstrong");
            } else {
                System.out.println("not amstrong");
            }

        }
    }
}









