package com.barash.day16.exam;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        SingleLinkedList ll=new SingleLinkedList();
        ll.insertfirst(4);
        ll.insertfirst(4);
        ll.insertfirst(4);
        ll.insertfirst(4);
        ll.display();
        System.out.println();
        ll.insertlast(23);
        ll.insertlast(32);
        ll.indexinsert(1,0);
        int v=ll.deletefirst();
        int r=ll.deletelast();
        System.out.println(v);
        System.out.println(r);

        ll.display();


    }
}
