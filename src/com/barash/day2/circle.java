package com.barash.day2;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float pi=3.147f;
        System.out.println("enter the radius of the circle:");
        float r=input.nextFloat();
        double area =pi*r*r;
        System.out.println("the area of the cicle is:"+area);
    }
}
