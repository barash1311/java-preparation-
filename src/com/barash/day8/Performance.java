package com.barash.day8;

import java.util.Arrays;

public class Performance {
    public static void main(String[] args) {
        String a="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            a=a+ch;

        }
        System.out.println(a);
    }
}
