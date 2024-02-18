package com.barash.day4;

import java.util.Scanner;

public class StringFunction {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(":enter your name:");
        String name=input.next();
        System.out.println(greeting(name));


    }
    static String greeting(String str){
        return "hello and how are you "+ str;
    }
}
