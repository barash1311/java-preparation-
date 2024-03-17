package com.barash.day12;

public class String4 {
    public static void main(String[] args) {
        sets("","abcd");

    }
    static void sets(String p,String up){
        if(up.isEmpty()){
            System.out.print("["+p+"],");
            return;
        }
        char ch=up.charAt(0);
        sets(p+ch,up.substring(1));
        sets(p,up.substring(1));

    }
}
