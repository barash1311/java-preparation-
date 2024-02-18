package com.barash.day1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number for which you wan to check:");
        int num=input.nextInt();
        if(num==1){
            System.out.println("not a prime nor a composite");
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("no is not");

            }
            else{
                System.out.println("no is prime");
                break;
            }
        }
    }
}
