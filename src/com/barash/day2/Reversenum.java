package com.barash.day2;

import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number whom you want ot reverse:");
        int n=input.nextInt();
        int reverse=0;
        while(n>0){
            int ans=n%10;
            reverse=reverse*10+ans;
            n/=10;
        }
        System.out.println("reversed no is :"+ reverse);
    }
}
