package com.barash.day12;

import java.util.ArrayList;

public class Permunations {
    public static void main(String[] args) {
        str("","abc");

    }
    public static void str(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            str(f+ch+l,up.substring(1));
        }
    }
    public static ArrayList<String> str2(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);


        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            ans.addAll(str2(f+ch+l,up.substring(1)));
        }
        return ans;
    }
}
