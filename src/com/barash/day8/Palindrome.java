package com.barash.day8;

public class Palindrome {
    public static void main(String[] args) {
        String str="abcba";
        boolean result=ispalindrome(str);
        System.out.println(result);

    }
    static boolean ispalindrome(String str){
        for(int i=0;i<str.length();i++){
            char start=str.charAt(0);
            char end=str.charAt(str.length()-1);
            if(start==end){
                return true;
            }
        }
        return false;
    }
}
