package com.barash.day4;

import java.util.Scanner;

public class Pythagorem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a=input.nextInt();
        System.out.println("enter the value of b :");
        int b=input.nextInt();
        System.out.println("enter the value of c :");
        int c=input.nextInt();
        Check(a,b,c);

    }
    static void Check(int a,int b,int c){
        int result=a*a+b*b;
        if(result==c*c){
            System.out.println("it is a pythagoream triplet");
        }
        else{
            System.out.println("it is not a pythogorram triplet");
        }
    }
}
