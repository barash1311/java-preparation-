package com.barash.day1;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your currency in indian rupee:");
        float in=input.nextFloat();
        double usd=0.012*in;
        System.out.println("usd currency is :"+usd);
    }
}
