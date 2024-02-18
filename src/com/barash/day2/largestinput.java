package com.barash.day2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class largestinput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int largest=Integer.MIN_VALUE;
        while(true){
            System.out.println("enterthe num to check");
            int num=input.nextInt();
            if(num==0){
                break;
            }
            if(num>largest){
                largest=num;
            }

        }
        if(largest!=Integer.MIN_VALUE){
            System.out.println("the largest valure  is "+largest);
        }
        else{
            System.out.println("no valid number weeter ");
        }
    }
}
