package com.barash.day12;

import java.util.ArrayList;

public class google17 {
    public static void main(String[] args) {
        goo("","12");

    }
    public static ArrayList<String> goo(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';//this will convert '2' in to 2
        ArrayList<String> list=new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3; i++) {
            char ch=(char)('a'+i);
            list.addAll(goo(p+ch,up.substring(1)));

        }
        return list;
        

    }
}
