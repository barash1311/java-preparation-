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
}
