package com.barash.day14.parents;

public class Son extends Parent{

    public Son() {
        super();
        System.out.println("son");
    }

    @Override
    void career() {
        System.out.println("i want to be a doctor");
    }

    @Override
    void partner() {
        System.out.println(" i love someone");
    }
}
