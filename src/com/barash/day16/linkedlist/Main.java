package com.barash.day16.linkedlist;

import com.barash.day16.linkedlist.LL;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertfirst(2);
        list.insertfirst(3);

        list.insertfirst(5);
        list.insertlast(24);
        list.insertlast(25);
        list.insertlast(26);
        list.insertlast(27);
        list.insertlast(28);
        list.insertlast(29);
        list.indexinsert(100,3);
        list.deletefirst();
        System.out.println(list.deletefirst());
        list.deletefirst();
        System.out.println(list.deletelast());
        System.out.println(list.deleteindex(0));
        System.out.println(list.find(25));
        list.display();


        list.display();
    }

}
