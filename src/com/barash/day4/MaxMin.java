package com.barash.day4;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number 1:");
        int num1=input.nextInt();
        System.out.println("enter the number 2:");
        int num2=input.nextInt();
        System.out.println("enter the number 3:");
        int num3=input.nextInt();
        checkMax(num1,num2,num3);
        checkMin(num1,num2,num3);

    }
    static void checkMax(int a,int b,int c ){
        if(a>b&&a>c){
            System.out.println(a+" is greater");
        }
        else if(b>a&&b>c){
            System.out.println(a+"is greater");
        }
        else{
            System.out.println(c+"is greater");
        }
    }
    static void checkMin(int a,int b,int c ){
        if(a<b&&a<c){
            System.out.println(a+" is smaller");
        }
        else if(b<a&&b<c){
            System.out.println(a+"is smaller");
        }
        else{
            System.out.println(c+"is smaller");
        }
    }
}
