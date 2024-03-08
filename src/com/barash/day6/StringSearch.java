package com.barash.day6;

public class StringSearch {
    public static void main(String[] args) {
        String str="barash sharma";
        System.out.println(strsr(str,'a'));

    }
    public static boolean strsr(String arr,char ch){
        for(int i=0;i<arr.length();i++){
            if(arr.length()==0){
                return false;
            }
            if(arr.charAt(i)==' '){
                continue;
            }
            if(ch==arr.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
