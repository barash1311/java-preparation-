package com.barash.day8;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        //interger is converted to the wrqpper clss and calling the to string
        System.out.println("barash"+new ArrayList<>(2));

    }

}
