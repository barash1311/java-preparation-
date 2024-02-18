package com.barash.day2;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the base lenght:");
        int b= input.nextInt();
        System.out.println("enter the height :");
        int h=input.nextInt();
        int area=b*h;
        System.out.println("the area is :"+area);
    }
}
