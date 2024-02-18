package com.barash.day1;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        System.out.print("enter the principle amount:");
        Scanner input =new Scanner(System.in);
        int p=(int)(input.nextInt());
        System.out.print("enter the rate of percentage:");
        float r=(float)(input.nextFloat());
        System.out.print("enter the time :");
        int t=(int)(input.nextInt());
        float si=(float)(p*r*t)/100;
        System.out.print("total si is :"+si);

    }
}
