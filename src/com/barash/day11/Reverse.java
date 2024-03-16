package com.barash.day11;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(rev2(12345));
        System.out.println(palindrome(12321));

    }
    static int sum=0;
    public static int  reverse(int n){
        if(n==0){
            return 0;
        }
        int last=n%10;
        sum=sum*10+last;
        reverse(n/10);
        return sum;

    }
    public static int rev2(int n){
        int digit=(int)(Math.log10(n)+1);
        return helper(n,digit);
    }
    public static int helper(int n,int digit){
        if(n==0){
            return n;
        }
        int rem=n%10;
        return (int)(rem*Math.pow(10,digit-1)+helper(n/10,digit-1));
    }
    public static boolean palindrome(int n){
        return n==rev2(n);
    }
}
