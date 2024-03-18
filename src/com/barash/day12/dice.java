package com.barash.day12;

public class dice {
    public static void main(String[] args) {
        thr("",4);

    }
    static void thr(String p, int target){
        if(target==0){
            System.out.println(p);
             return;
        }
        for (int i = 1; i <= 6 && i<=target; i++) {
            thr(p+i,target-i);

        }
    }
}
