package com.barash.day2;

import java.util.Scanner;

public class Reactangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the base length:");
        float l = input.nextFloat();
        System.out.print("enter the height:");
        float b = input.nextFloat();
        double a = b * l;
        System.out.print("the area is :" + a);
    }
}
