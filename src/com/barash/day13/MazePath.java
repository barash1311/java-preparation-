package com.barash.day13;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        System.out.println(Path2("",3,3));

    }
    public static void Path0(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            Path0(p+"D",r-1,c);
        }
        if(c>1){
            Path0(p+"R",r,c-1);
        }
    }
    public static ArrayList<String> Path(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1){
            list.addAll(Path(p+"D",r-1,c));

        }
        if(c>1){
            list.addAll(Path(p+"R",r,c-1));
        }
        return list;
    }
    public static void Path1(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            Path1(p+"D",r-1,c-1);
        }
        if(r>1){
            Path1(p+"D",r-1,c);
        }
        if(c>1){
            Path1(p+"R",r,c-1);
        }
    }
    public static int Path2(String p,int r,int c){
        int left=0,right=0,diagonal=0;
        if(r==1 && c==1){
            return 1 ;
        }
        if(r>1 && c>1){
            diagonal=Path2(p+"D",r-1,c-1);
        }

        if(r>1){
           left= Path2(p+"D",r-1,c);
        }
        if(c>1){
            right=Path2(p+"R",r,c-1);
        }
    return left+right+diagonal;
    }
}
