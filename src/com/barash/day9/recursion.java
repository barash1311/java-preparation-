package com.barash.day9;

public class recursion {
    public static void main(String[] args) {

            System.out.println(rec(2));


    }
    public static int rec(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
