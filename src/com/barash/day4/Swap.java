package com.barash.day4;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the first number:");
        int num1=input.nextInt();
        System.out.print("enter the second number:");
        int num2=input.nextInt();
        System.out.println("number before swapping:");
        System.out.println(num1+" "+num2);
        System.out.println("number after swapping:");
        swap(num1,num2);

        // System.out.println(num1+" "+num2);


    }
    static  void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

    }
}
