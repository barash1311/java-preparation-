package com.barash.day11;

public class SumofDigit {
    public static void main(String[] args) {
        System.out.println(ssumofdigit(55555));

    }
    public static int ssumofdigit(int n){
        if(n==0){
            return 0;
        }

        return (n%10)+ssumofdigit(n/10);
    }
    public static int product(int n){
        if(n%10==n){
            return n;
        }

        return (n%10)*product(n/10);
    }
}
