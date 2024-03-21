package com.barash.day13;

public class Human {
    int age;
    String name;
    boolean married;
     static int population;
    public Human(int age,String name,boolean married){
        this.age=age;
        this.name=name;
        this.married=married;
        Human.population+=1;
    }
    public void display(){
        System.out.print(this.age+" ");
        System.out.print(this.name+" ");
        System.out.print(this.married+" ");
        System.out.print(population+" ");
    }
}
