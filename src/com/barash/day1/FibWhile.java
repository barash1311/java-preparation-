package com.barash.day1;

import java.util.Scanner;

public class FibWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the numebr for which you want :");
        int n=input.nextInt();
        int a=0;
        int b=1;
        int count=2;
        System.out.print(a+" "+b+" ");
        while(count<=n){
            int next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
            count++;
        }
    }
}
