package com.barash.day2;

import java.util.Scanner;

public class Isosless {
    public static void main(String[] args) {//a b c
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length:");
        double a=input.nextDouble();
        double base=a;
        System.out.println("enter the base length:");
        double c=input.nextDouble();
        double altitude=Math.sqrt(a*a-(c*c)/4);
        double area=0.5*c*altitude;
        System.out.println("the area is :"+area);



    }
}
