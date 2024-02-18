package com.barash.day4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number to find the factorial:");
        int n=input.nextInt();
        int ans=factorial(n);
        System.out.println("the factorial is :"+ans);

    }
    static int factorial(int n){
        int result=1;
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        else{
            for(int i=1;i<=n;i++){
                //here we can use the recusion as well
                // but think twice as result recursion means
                // reptitive multiplication with the terms
                //n=5
                //result=1*i==1
                //result=1*2=2
                //result2*3==6
                //result6*4==24
                //result24*5==120
                result*=i;
            }
            return result;
        }
    }
}
