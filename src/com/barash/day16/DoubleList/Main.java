package com.barash.day16.DoubleList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DD list=new DD();
        for (int i = 1; i < 10; i++) {
            list.insertfirst(i);

        }

        list.insertlast(23);
        list.insertafter(2,23);
        list.insertafter(2,65);
        list.display();
        //list.displayrev();

    }
}
