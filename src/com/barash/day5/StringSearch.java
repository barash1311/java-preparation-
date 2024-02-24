package com.barash.day5;

public class StringSearch {
    public static void main(String[] args) {
        String str="barash";
        char ch='g';
        System.out.println(Search(str,ch));
    }
    static Boolean Search(String str,char ch){
        if(str.isEmpty()){
            return false;
        }
        else{
            for(int i=0;i<str.length();i++){
                if(ch==str.charAt(i)){
                    return true;
                }
            }
            return false;
        }
    }
}
