package com.barash.day2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the base length:");
        float b=input.nextFloat();
        System.out.println("enter the height:");
        float h=input.nextFloat();
        double area=0.5*b*h;
        System.out.println("the area is :"+area);
    }
}
