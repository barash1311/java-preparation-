package com.barash.day16.Practice;

public class Main {
    public static void main(String[] args) {
        Link link=new Link();
        link.insertfirst(4);
        link.insertfirst(5);
        link.insertfirst(6);
        link.insertfirst(7);
        link.insertfirst(8);
        link.insertfirst(9);
//        link.insertlast(5);
//        link.insertlast(6);
//        link.insertlast(7);
//        link.insertlast(8);
       // link.insert(23,3);
        //System.out.println(link.deletefirst());
        System.out.println(link.indexdel(2));
//        System.out.println(link.deletefirst());
//        System.out.println(link.deletefirst());
//        System.out.println(link.deletefirst());
//        System.out.println(link.deletefirst());
//        System.out.println(link.deletefirst());
//        System.out.println(link.deletefirst());
        System.out.println(link.deletelast());

        link.display();
    }
}
