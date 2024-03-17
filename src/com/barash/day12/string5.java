package com.barash.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class string5 {
    public static void main(String[] args) {
        System.out.println(seq("","abcd"));
    }
    public static ArrayList<String> seq(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=seq(p + ch,up.substring(1));
        ArrayList<String> right=seq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
