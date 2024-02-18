package com.barash.day1;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        System.out.print("enter your nationality:");
        Scanner input=new Scanner(System.in);
        String s=input.next();
        if(s.equals("indian")){
            System.out.print("nameste");

        }
        else if(s.equals("us")){
            System.out.print("hi there");
        }
        else{
            System.out.print("bounjour");
        }
    }
}
